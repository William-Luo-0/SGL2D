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
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(SGL2DParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(SGL2DParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#incCounter1}.
	 * @param ctx the parse tree
	 */
	void enterIncCounter1(SGL2DParser.IncCounter1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#incCounter1}.
	 * @param ctx the parse tree
	 */
	void exitIncCounter1(SGL2DParser.IncCounter1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#decCounter1}.
	 * @param ctx the parse tree
	 */
	void enterDecCounter1(SGL2DParser.DecCounter1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#decCounter1}.
	 * @param ctx the parse tree
	 */
	void exitDecCounter1(SGL2DParser.DecCounter1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#incCounter2}.
	 * @param ctx the parse tree
	 */
	void enterIncCounter2(SGL2DParser.IncCounter2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#incCounter2}.
	 * @param ctx the parse tree
	 */
	void exitIncCounter2(SGL2DParser.IncCounter2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#decCounter2}.
	 * @param ctx the parse tree
	 */
	void enterDecCounter2(SGL2DParser.DecCounter2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#decCounter2}.
	 * @param ctx the parse tree
	 */
	void exitDecCounter2(SGL2DParser.DecCounter2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#incCounter3}.
	 * @param ctx the parse tree
	 */
	void enterIncCounter3(SGL2DParser.IncCounter3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#incCounter3}.
	 * @param ctx the parse tree
	 */
	void exitIncCounter3(SGL2DParser.IncCounter3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#decCounter3}.
	 * @param ctx the parse tree
	 */
	void enterDecCounter3(SGL2DParser.DecCounter3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#decCounter3}.
	 * @param ctx the parse tree
	 */
	void exitDecCounter3(SGL2DParser.DecCounter3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#incSpriteCounter}.
	 * @param ctx the parse tree
	 */
	void enterIncSpriteCounter(SGL2DParser.IncSpriteCounterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#incSpriteCounter}.
	 * @param ctx the parse tree
	 */
	void exitIncSpriteCounter(SGL2DParser.IncSpriteCounterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#decSpriteCounter}.
	 * @param ctx the parse tree
	 */
	void enterDecSpriteCounter(SGL2DParser.DecSpriteCounterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#decSpriteCounter}.
	 * @param ctx the parse tree
	 */
	void exitDecSpriteCounter(SGL2DParser.DecSpriteCounterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#setSpriteCounter}.
	 * @param ctx the parse tree
	 */
	void enterSetSpriteCounter(SGL2DParser.SetSpriteCounterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#setSpriteCounter}.
	 * @param ctx the parse tree
	 */
	void exitSetSpriteCounter(SGL2DParser.SetSpriteCounterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#transformOnZeroCounter}.
	 * @param ctx the parse tree
	 */
	void enterTransformOnZeroCounter(SGL2DParser.TransformOnZeroCounterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#transformOnZeroCounter}.
	 * @param ctx the parse tree
	 */
	void exitTransformOnZeroCounter(SGL2DParser.TransformOnZeroCounterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#gameOverOnZeroCounter}.
	 * @param ctx the parse tree
	 */
	void enterGameOverOnZeroCounter(SGL2DParser.GameOverOnZeroCounterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#gameOverOnZeroCounter}.
	 * @param ctx the parse tree
	 */
	void exitGameOverOnZeroCounter(SGL2DParser.GameOverOnZeroCounterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#winOnZeroCounter}.
	 * @param ctx the parse tree
	 */
	void enterWinOnZeroCounter(SGL2DParser.WinOnZeroCounterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#winOnZeroCounter}.
	 * @param ctx the parse tree
	 */
	void exitWinOnZeroCounter(SGL2DParser.WinOnZeroCounterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#moveToRandom}.
	 * @param ctx the parse tree
	 */
	void enterMoveToRandom(SGL2DParser.MoveToRandomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#moveToRandom}.
	 * @param ctx the parse tree
	 */
	void exitMoveToRandom(SGL2DParser.MoveToRandomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#transformToSprite}.
	 * @param ctx the parse tree
	 */
	void enterTransformToSprite(SGL2DParser.TransformToSpriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#transformToSprite}.
	 * @param ctx the parse tree
	 */
	void exitTransformToSprite(SGL2DParser.TransformToSpriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#movePlayerTo}.
	 * @param ctx the parse tree
	 */
	void enterMovePlayerTo(SGL2DParser.MovePlayerToContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#movePlayerTo}.
	 * @param ctx the parse tree
	 */
	void exitMovePlayerTo(SGL2DParser.MovePlayerToContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#gameOver}.
	 * @param ctx the parse tree
	 */
	void enterGameOver(SGL2DParser.GameOverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#gameOver}.
	 * @param ctx the parse tree
	 */
	void exitGameOver(SGL2DParser.GameOverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SGL2DParser#win}.
	 * @param ctx the parse tree
	 */
	void enterWin(SGL2DParser.WinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SGL2DParser#win}.
	 * @param ctx the parse tree
	 */
	void exitWin(SGL2DParser.WinContext ctx);
}