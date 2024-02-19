// Generated from C:/Users/wangz/IdeaProjects/Riddle-Kotlin/ast/RiddleParser.g4 by ANTLR 4.13.1
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
}