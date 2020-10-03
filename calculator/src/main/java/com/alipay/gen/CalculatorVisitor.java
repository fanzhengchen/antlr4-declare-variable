// Generated from /Users/fanzhengchen/RenderGroup/antlr4/antlr-example/calculator/src/main/resources/Calculator.g4 by ANTLR 4.8
package com.alipay.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CalculatorParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CalculatorParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(CalculatorParser.AtomContext ctx);
}