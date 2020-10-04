// Generated from /Users/fanzhengchen/IntellijProjects/antlr4/antlr-example/declare-variable/src/main/resources/Mark.g4 by ANTLR 4.8
package com.alipay.parse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MarkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MarkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MarkParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MarkParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(MarkParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(MarkParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MarkParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(MarkParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(MarkParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MarkParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(MarkParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#addSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(MarkParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#mulDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(MarkParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(MarkParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MarkParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(MarkParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MarkParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(MarkParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(MarkParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MarkParser.ReturnStatementContext ctx);
}