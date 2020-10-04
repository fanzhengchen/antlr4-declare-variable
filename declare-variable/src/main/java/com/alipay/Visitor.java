/*
 * Visitor.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.alipay;

import com.alipay.parse.MarkBaseVisitor;
import com.alipay.parse.MarkParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shengxun
 */
public class Visitor extends MarkBaseVisitor<Integer> {

    private Map<String, Integer> symbolicTable = new HashMap<>();

    private Map<Integer, Integer> registerMap = new HashMap<>();

    private Integer returnValue = 0;

    private boolean hasReturn = false;

    @Override
    public Integer visitBlock(final MarkParser.BlockContext ctx) {
        Integer ret = super.visitBlock(ctx);
        System.out.println("block " + ret + " " + returnValue);
        return returnValue;
    }

    @Override
    public Integer visitExpression(final MarkParser.ExpressionContext ctx) {
        Integer ret = 0;
        if(ctx.assignmentExpression() != null) {
            ret = visitAssignmentExpression(ctx.assignmentExpression());
        }else if(ctx.addSubExpression() != null) {
            ret = visitAddSubExpression(ctx.addSubExpression());
        }
        System.out.println("visitExpression | " + ctx.getText() + " : " + ret);
        return ret;
    }

    @Override
    public Integer visit(final ParseTree tree) {
        Integer ret = super.visit(tree);
        System.out.println("visit " + ret);
        return returnValue;
    }

    @Override
    public Integer visitAddSubExpression(final MarkParser.AddSubExpressionContext ctx) {

        Integer ret = 0;
        Integer lhs = visitMulDivExpression(ctx.mulDivExpression());
        if (ctx.addSubExpression() == null) {
            ret = lhs;
            return ret;
        }

        Integer rhs = visitAddSubExpression(ctx.addSubExpression());
        if (ctx.ADD() != null) {
            ret = lhs + rhs;
        } else if (ctx.SUB() != null) {
            ret = lhs - rhs;
        } else {
            throw new RuntimeException("visitAddSubExpression");
        }
        return ret;
    }

    @Override
    public Integer visitMulDivExpression(final MarkParser.MulDivExpressionContext ctx) {

        Integer ret = 0;
        Integer lhs = visitUnaryExpression(ctx.unaryExpression());
        if (ctx.mulDivExpression() == null) {
            ret = lhs;
            return ret;
        }
        Integer rhs = visitMulDivExpression(ctx.mulDivExpression());
        if (ctx.MUL() != null) {
            ret = lhs * rhs;
        } else if (ctx.DIV() != null) {
            ret = lhs / rhs;
        } else {
            throw new RuntimeException("visitMulDivExpression");
        }
        return ret;
    }

    @Override
    public Integer visitLiteral(final MarkParser.LiteralContext ctx) {
        System.out.println("----" + ctx.getText());
        Integer ret = 0;
        if (ctx.IntegerLiteral() != null) {
            ret = Integer.parseInt(ctx.IntegerLiteral().getText());
        }
        return ret;
    }

    @Override
    public Integer visitUnaryExpression(final MarkParser.UnaryExpressionContext ctx) {
        System.out.println("----" + ctx.getText());
        Integer ret = 0;
        if (ctx.LPAREN() != null) {
            ret = visitExpression(ctx.expression());
        } else if (ctx.Identifier() != null) {
            TerminalNode identifier = ctx.Identifier();
            String symbol = identifier.getText();
            System.out.println("visitUnaryExpression | " +
                    symbol + " : " + getValue(symbol));
            ret = getValue(symbol);
        } else {
            ret = visitLiteral(ctx.literal());
        }
        return ret;
    }

    @Override
    public Integer visitExpressionName(final MarkParser.ExpressionNameContext ctx) {
        Token token = ctx.Identifier().getSymbol();
        String symbolic = token.getText();
        return getVariableId(symbolic);
    }

    @Override
    public Integer visitAssignment(final MarkParser.AssignmentContext ctx) {
        System.out.println("visitAssignment | " + ctx.getText());
        Integer variableId = visitLeftHandSide(ctx.leftHandSide());
        Integer rhs = visitExpression(ctx.expression());
        MarkParser.AssignmentOperatorContext assignOp = ctx.assignmentOperator();

        System.out.println("variableId " + variableId);
        System.out.println("rhs "  + rhs);
        Integer ret = 0;
        if (assignOp.ASSIGN() != null) {
            ret = rhs;
        } else {
            Integer oldValue = registerMap.get(variableId);
            ret = oldValue * rhs;
        }
        registerMap.put(variableId, ret);
        return ret;
    }

    @Override
    public Integer visitReturnStatement(final MarkParser.ReturnStatementContext ctx) {

        Integer ret = visitExpression(ctx.expression());
        hasReturn = true;
        returnValue = ret;

        return ret;
    }

    private Integer getValue(String symbol) {
        Integer variableId = getVariableId(symbol);
        System.out.println("symbol " + symbol + " variableId | " + variableId + ":" + registerMap.get(variableId) );
        return registerMap.get(variableId);
    }

    private Integer getVariableId(String symbol) {
        if (symbolicTable.containsKey(symbol)) {
            return symbolicTable.get(symbol);
        }
        int size = symbolicTable.size();
        symbolicTable.put(symbol, size);
        return size;
    }
}
