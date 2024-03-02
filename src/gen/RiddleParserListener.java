package gen;// Generated from C:/Users/wangz/IdeaProjects/Riddle-Kotlin/ast/RiddleParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RiddleParser}.
 */
public interface RiddleParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RiddleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RiddleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RiddleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#newline_statment}.
	 * @param ctx the parse tree
	 */
	void enterNewline_statment(RiddleParser.Newline_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#newline_statment}.
	 * @param ctx the parse tree
	 */
	void exitNewline_statment(RiddleParser.Newline_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(RiddleParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(RiddleParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(RiddleParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(RiddleParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(RiddleParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(RiddleParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#variableDefine}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefine(RiddleParser.VariableDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#variableDefine}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefine(RiddleParser.VariableDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(RiddleParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(RiddleParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(RiddleParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(RiddleParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#funcDefine}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefine(RiddleParser.FuncDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#funcDefine}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefine(RiddleParser.FuncDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(RiddleParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(RiddleParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RiddleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RiddleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RiddleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RiddleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(RiddleParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(RiddleParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(RiddleParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(RiddleParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#notEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpression(RiddleParser.NotEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#notEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpression(RiddleParser.NotEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#greaterExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterExpression(RiddleParser.GreaterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#greaterExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterExpression(RiddleParser.GreaterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#lessExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessExpression(RiddleParser.LessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#lessExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessExpression(RiddleParser.LessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#lessEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessEqualExpression(RiddleParser.LessEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#lessEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessEqualExpression(RiddleParser.LessEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#idExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(RiddleParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#idExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(RiddleParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#typeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTypeLiteral(RiddleParser.TypeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#typeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTypeLiteral(RiddleParser.TypeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(RiddleParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(RiddleParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(RiddleParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(RiddleParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#strLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStrLiteral(RiddleParser.StrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#strLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStrLiteral(RiddleParser.StrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(RiddleParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(RiddleParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(RiddleParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(RiddleParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(RiddleParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(RiddleParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#boolenLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolenLiteral(RiddleParser.BoolenLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#boolenLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolenLiteral(RiddleParser.BoolenLiteralContext ctx);
}