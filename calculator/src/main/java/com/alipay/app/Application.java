/*
 * Application.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.alipay.app;

import com.alipay.gen.CalculatorLexer;
import com.alipay.gen.CalculatorParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author shengxun
 */
public class Application {


    public Application() {

    }

    public void run(String expr) {
        CharStream charStream = CharStreams.fromString(expr);

        CalculatorLexer lexer = new CalculatorLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree parseTree = parser.expr();

        System.out.println(parseTree.toStringTree(parser));
        Visitor visitor = new Visitor();
        Integer ret = parseTree.accept(visitor);
        System.out.println(ret);
    }
}
