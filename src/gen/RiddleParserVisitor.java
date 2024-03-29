package gen;// Generated from C:/Users/wangz/IdeaProjects/Riddle-Kotlin/ast/RiddleParser.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link RiddleParser#newline_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline_statment(RiddleParser.Newline_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(RiddleParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(RiddleParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(RiddleParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#variableDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefine(RiddleParser.VariableDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(RiddleParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(RiddleParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#funcDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefine(RiddleParser.FuncDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(RiddleParser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(RiddleParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RiddleParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(RiddleParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(RiddleParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#notEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualExpression(RiddleParser.NotEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#greaterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterExpression(RiddleParser.GreaterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#lessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessExpression(RiddleParser.LessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#lessEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqualExpression(RiddleParser.LessEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#idExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(RiddleParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#typeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLiteral(RiddleParser.TypeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(RiddleParser.BasicTypeContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link RiddleParser#boolenLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolenLiteral(RiddleParser.BoolenLiteralContext ctx);
}