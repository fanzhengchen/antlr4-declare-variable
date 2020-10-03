
grammar Calculator;


NUMBER  : [0-9]+; // number integer
ADD     : '+';
SUB     : '-';
DIV     : '/';
MUL     : '*';
LPAR    : '(';
RPAR    : ')';
WS      : [ \n\t\r]+ -> skip;

expr: term
    ;

term: factor ADD term
    | factor SUB term
    | factor
    ;

factor: atom MUL factor
    | atom DIV factor
    | atom
    ;

atom: (ADD | SUB)NUMBER
    | NUMBER
    | LPAR term RPAR
    ;




