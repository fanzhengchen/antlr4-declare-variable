// Generated from /Users/fanzhengchen/IntellijProjects/antlr4/antlr-example/declare-variable/src/main/resources/Mark.g4 by ANTLR 4.8
package com.alipay.parse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarkParser}.
 */
public interface MarkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarkParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MarkParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MarkParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(MarkParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(MarkParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MarkParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MarkParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MarkParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MarkParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MarkParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MarkParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(MarkParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(MarkParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MarkParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MarkParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(MarkParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(MarkParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(MarkParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(MarkParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(MarkParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(MarkParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(MarkParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(MarkParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MarkParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MarkParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(MarkParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(MarkParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MarkParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MarkParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(MarkParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(MarkParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(MarkParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(MarkParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MarkParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MarkParser.ReturnStatementContext ctx);
}