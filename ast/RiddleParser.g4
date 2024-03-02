parser grammar RiddleParser;
options {
    tokenVocab = RiddleLexer;
}
program
    : newline_statment* statment? EOF
    ;

newline_statment
    : statment NewLine
    | NewLine
    ;

statment
    : variableDefine
    | expression
    | block
    | funcDefine
    | while
    | print
    | statment Semi statment?
    | Semi
    ;

//内置的外部输出控制，临时测试用
print
    : Print LeftParen expression RightParen
    ;

//既是表达式也是语句
primaryExpression
    : literal
    | idExpression
    | LeftParen expression RightParen
    | ifExpression
    ;


variableDefine
    : (Var | Val) (Identfier(Assign expression)?) (Comma (Identfier(Assign expression)?))*
    ;

ifExpression
    : If LeftParen expression RightParen statment
      (Else statment)?
    ;

while
    : While LeftParen expression RightParen statment
    ;

//todo 完成funcDefine的传参处理
funcDefine
    : Fun Identfier LeftParen (Identfier Colon typeLiteral)* RightParen funcBody
    ;

//这里funcBody还需要额外处理return
funcBody
    : LeftBrace statment* RightBrace
    ;

block
    : LeftBrace statment* RightBrace
    ;

//表达式

expression
    : assignExpression
    ;

assignExpression
    : equalExpression
    | Identfier Assign assignExpression
    ;

equalExpression
    : primaryExpression
    | equalExpression Equal primaryExpression
    ;


idExpression
    : Identfier
    ;

typeLiteral
    : basicType
    ;

basicType
    : Int
    | Char
    | Float
    | Boolen
    | String
    ;



//字面量
literal
    : intLiteral
    | strLiteral
    | charLiteral
    | floatLiteral
    | boolenLiteral
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

boolenLiteral
    : True
    | False
    ;