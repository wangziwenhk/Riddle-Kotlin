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
    | funcDefine
    ;

variableDefine
    : (Var | Val) (Identfier(Assign primaryExpression)?) (Comma (Identfier(Assign primaryExpression)?))*
    ;

ifExpression
    : If LeftParen primaryExpression RightParen (block | statment)
      (Else (block | statment))?
    ;

//todo 完成funcDefine的传参处理
funcDefine
    : Fun Identfier LeftParen RightParen funcBody
    ;

//这里funcBody还需要额外处理return
funcBody
    : LeftBrace statment* RightBrace
    ;

block
    : LeftBrace statment* RightBrace
    ;


//既是表达式也是语句
primaryExpression
    : literal
    | idExpression
    | assignExpression
    | ifExpression
    ;


assignExpression
    : Identfier Assign primaryExpression
    ;

idExpression
    : Identfier
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