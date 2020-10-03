/*
 * Main.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.alipay.app;

import org.antlr.v4.runtime.CharStream;

/**
 * @author shengxun
 */
public class Main {

    public static void main(String[] args) {

        Application app = new Application();

        String expr = "1+2+9+(9 * 10 ) / 10";
        app.run(expr);
    }
}
