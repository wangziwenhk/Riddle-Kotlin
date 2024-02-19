parser grammar RiddleParser;
options {
    tokenVocab = RiddleLexer;
}
program
    : statment*
    ;

statment
    : variableDefine Semi
    | primaryExpression Semi
    | block
    ;

variableDefine
    : (Var | Val) (Identfier(Assign primaryExpression)?) (Comma (Identfier(Assign primaryExpression)?))*
    ;

block
    : LeftBrace statment* RightBrace
    ;


//既是表达式也是语句
primaryExpression
    : literal
    | idExpression
    | assignExpression
    ;


assignExpression
    : Identfier Assign primaryExpression
    ;

idExpression
    : Identfier
    | Identfier (Dot Identfier)
    ;

//字面量
literal
    : intLiteral
    | strLiteral
    | charLiteral
    | floatLiteral
    ;

strLiteral
    : StringLiteral
    ;

charLiteral
    : CharLiteral
    ;

//整数字面量
intLiteral
    : IntegerLiteral
    ;

floatLiteral
    : FloatLiteral
    ;