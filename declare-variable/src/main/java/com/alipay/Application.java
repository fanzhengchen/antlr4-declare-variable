/*
 * app.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.alipay;

import com.alipay.parse.MarkLexer;
import com.alipay.parse.MarkParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.InputStream;

/**
 * @author shengxun
 */
public class Application {

    private Visitor visitor;

    public static void main(String[] args)  {
        Application app = new Application();
        try {
            app.run("code");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Application() {
        visitor = new Visitor();
    }

    public ClassLoader getClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    public InputStream getResourceStream(String filename) {
        ClassLoader classLoader = getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filename);
        return inputStream;
    }

    public void run(String filename) throws Exception {
        InputStream inputStream = getResourceStream(filename);
        CharStream charStream = CharStreams.fromStream(inputStream);
        Lexer lexer = new MarkLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MarkParser parser = new MarkParser(tokens);
        ParseTree parseTree = parser.block();
        System.out.println(parseTree.toStringTree(parser));

        execute(parseTree);
    }

    public void execute(ParseTree parseTree) {
         Integer ret = parseTree.accept(visitor);
         System.out.println(ret);
    }
}
