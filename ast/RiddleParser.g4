parser grammar RiddleParser;
options {
    tokenVocab = RiddleLexer;
}
program
    : statment* EOF
    ;

statment
    : variableDefine LineBreak
    | primaryExpression LineBreak
    | block
    | funcDefine
    | while
    | Semi
    | LineBreak
    ;

//既是表达式也是语句
primaryExpression
    : literal
    | idExpression
    | assignExpression
    | ifExpression
    ;


variableDefine
    : (Var | Val) (Identfier(Assign primaryExpression)?) (Comma (Identfier(Assign primaryExpression)?))*
    ;

ifExpression
    : If LeftParen primaryExpression RightParen statment
      (Else statment)?
    ;

while
    : While LeftParen primaryExpression RightParen statment
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
