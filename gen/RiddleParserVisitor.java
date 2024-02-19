// Generated from C:/Users/wangz/IdeaProjects/Riddle-Kotlin/ast/RiddleParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RiddleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RiddleParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RiddleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RiddleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(RiddleParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#variableDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefine(RiddleParser.VariableDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(RiddleParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(RiddleParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(RiddleParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#idExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(RiddleParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(RiddleParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#strLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLiteral(RiddleParser.StrLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#charLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(RiddleParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#intLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(RiddleParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(RiddleParser.FloatLiteralContext ctx);
}