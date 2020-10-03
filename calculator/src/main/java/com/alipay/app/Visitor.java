/*
 * Visitor.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.alipay.app;

import com.alipay.gen.CalculatorBaseVisitor;
import com.alipay.gen.CalculatorParser;
import com.alipay.gen.CalculatorVisitor;

/**
 * @author shengxun
 */
public class Visitor extends CalculatorBaseVisitor<Integer> {


    @Override
    public Integer visitExpr(final CalculatorParser.ExprContext ctx) {
        if(ctx.term() != null) {
            return visitTerm(ctx.term());
        }
        throw new RuntimeException("visit Expr " +  ctx.toString());
    }

    @Override
    public Integer visitTerm(final CalculatorParser.TermContext ctx) {
        if (ctx.SUB() != null) {
            return visitFactor(ctx.factor()) -  visitTerm(ctx.term());
        } else if(ctx.ADD() != null) {
            return visitFactor(ctx.factor()) + visitTerm(ctx.term());
        }
        return visitFactor(ctx.factor());
    }

    @Override
    public Integer visitAtom(final CalculatorParser.AtomContext ctx) {
        if (ctx.NUMBER() != null) {
            String text = ctx.NUMBER().getText();
            return Integer.parseInt(text);
        } else if(ctx.LPAR() != null && ctx.RPAR() != null) {
            return visitTerm(ctx.term());
        }
        throw new RuntimeException("visit atom " +  ctx.toString());
    }

    @Override
    public Integer visitFactor(final CalculatorParser.FactorContext ctx) {
        if(ctx.MUL() != null) {
            return visitAtom(ctx.atom()) * visitFactor(ctx.factor());
        } else  if(ctx.DIV() != null) {
            return visitAtom(ctx.atom()) / visitFactor(ctx.factor());
        } else if(ctx.atom() != null) {
            return visitAtom(ctx.atom());
        }
        throw new RuntimeException("visit factor " +  ctx.toString());
    }
}
