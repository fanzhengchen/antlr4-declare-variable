

grammar Mark;


IntegerLiteral: [0-9]+ ;

IntegerLiteralSuffix: [lL] ;

INT             : 'int'     ;
SHORT           : 'short'   ;
DOUBLE          : 'double'  ;
FLOAT           : 'float'   ;



RETURN          : 'return'  ;
ASSIGN          : '='       ;
MUL_ASSIGN      : '*='      ;
ADD             : '+'       ;
MUL             : '*'       ;
SUB             : '-'       ;
DIV             : '/'       ;
LPAREN          : '('       ;
RPAREN          : ')'       ;
SEMI_COL        : ';'       ;



Identifier: [_0-9a-zA-Z][_0-9a-zA-Z]* ;


WS  :  [ \t\r\n\u000C]+ -> skip
    ;

//

block
	:	'{' blockStatements? '}'
	;

blockStatements
	:	blockStatement+
	;

blockStatement
	:	statement
	;

statement
    : block
    | expressionStatement
    | returnStatement
    ;

expressionStatement
	:	statementExpression ';'
	;

statementExpression
	:	assignmentExpression
	;


literal
    :   IntegerLiteral
    ;

assignmentOperator
    :   ASSIGN
    |   MUL_ASSIGN
    ;

addSubExpression
    :   mulDivExpression '+' addSubExpression
    |   mulDivExpression '-' addSubExpression
    |   mulDivExpression
    ;

mulDivExpression
    :   unaryExpression '*' mulDivExpression
    |   unaryExpression '/' mulDivExpression
    |   unaryExpression
    ;

unaryExpression
    :   LPAREN expression RPAREN
    |   Identifier
    |   literal
    ;

expression
	:	assignmentExpression
	|   addSubExpression
	;

assignmentExpression
    :   assignment
    ;

assignment
    :   leftHandSide assignmentOperator expression
    ;

leftHandSide
    :   expressionName
    ;

expressionName
    :   Identifier
    ;



returnStatement
	:	RETURN expression? ';'
	;
