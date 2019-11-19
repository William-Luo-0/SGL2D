// Generated from C:/Users/William Luo/Desktop/University/CPSC 311/sgl2d/starter/src\SGL2D.g4 by ANTLR 4.7.2
package SGL2DANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SGL2DParser}.
 */
public interface SGL2DListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SGL2DParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SGL2DParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SGL2DParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SGL2DParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#environment}.
	 * @param ctx the parse tree
	 */
	void enterEnvironment(SGL2DParser.EnvironmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#environment}.
	 * @param ctx the parse tree
	 */
	void exitEnvironment(SGL2DParser.EnvironmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(SGL2DParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(SGL2DParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#player}.
	 * @param ctx the parse tree
	 */
	void enterPlayer(SGL2DParser.PlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#player}.
	 * @param ctx the parse tree
	 */
	void exitPlayer(SGL2DParser.PlayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#sprite}.
	 * @param ctx the parse tree
	 */
	void enterSprite(SGL2DParser.SpriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#sprite}.
	 * @param ctx the parse tree
	 */
	void exitSprite(SGL2DParser.SpriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#counter}.
	 * @param ctx the parse tree
	 */
	void enterCounter(SGL2DParser.CounterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#counter}.
	 * @param ctx the parse tree
	 */
	void exitCounter(SGL2DParser.CounterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(SGL2DParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(SGL2DParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(SGL2DParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(SGL2DParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(SGL2DParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(SGL2DParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(SGL2DParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(SGL2DParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(SGL2DParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(SGL2DParser.RangeContext ctx);
}