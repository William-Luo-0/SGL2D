import SGL2DANTLR.SGL2DBaseListener;
import SGL2DANTLR.SGL2DLexer;
import SGL2DANTLR.SGL2DParser;
import model.GenericGame;
import model.Sprite;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class GameFactory {
    public GenericGame createGame (InputStream in) throws IOException {
        GenericGame genericGame = new GenericGame();
        // TODO: Change this as well as in SGL2D to take in an input file name from read sys call or however you like
        // TODO: May have to do changes so it takes in the counter panel input or forwards it to another method call later
        SGL2DLexer lexer = new SGL2DLexer(CharStreams.fromFileName("/test-game.sgl2d"));
        SGL2DParser parser = new SGL2DParser(new CommonTokenStream(lexer));
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });

        final AtomicReference<String> name = new AtomicReference<>();
        final Map<String, Integer> points = new HashMap<>();
        final String[][] grid = new String[5][5];

        // TODO: Finish rest of the cases
        parser.addParseListener(new SGL2DBaseListener() {

            @Override
            public void exitEnvironment(SGL2DParser.EnvironmentContext ctx) {
                if(ctx.XINT().size() > 0){
                    String xText = ctx.XINT().get(0).getText();
                    genericGame.setRows(Integer.parseInt(xText));
                }
                if(ctx.YINT().size() > 0){
                    String yText = ctx.YINT().get(0).getText();
                    genericGame.setColumns(Integer.parseInt(yText));
                }
            }

            @Override
            public void exitGoal(SGL2DParser.GoalContext ctx){
                if(ctx.XINT().size() > 0){
                    String xText = ctx.XINT().get(0).getText();
                    genericGame.setGoalX(Integer.parseInt(xText));
                }
                if(ctx.YINT().size() > 0){
                    String yText = ctx.YINT().get(0).getText();
                    genericGame.setGoalY(Integer.parseInt(yText));
                }
                if(ctx.COLOR().size() > 0){
                    String colorText = ctx.COLOR().get(0).getText();
                    genericGame.setGoalColor(colorText);
                }
            }

            @Override
            public void exitPlayer(SGL2DParser.PlayerContext ctx){
                if(ctx.XINT().size() > 0 && ctx.YINT().size() > 0){
                    String xText = ctx.XINT().get(0).getText();
                    String yText = ctx.YINT().get(0).getText();
                    genericGame.setPlayerCords(Integer.parseInt(xText),Integer.parseInt(yText));
                }
                if(ctx.COLOR().size() > 0){
                    String colorText = ctx.COLOR().get(0).getText();
                    genericGame.setPlayerColor(colorText);

                }
            }

            @Override
            public void exitSprite(SGL2DParser.SpriteContext ctx) {
                if(ctx.WORD() != null){
                    String wordText = ctx.WORD().getText();
                    try{
                        genericGame.addSprite(wordText);
                        if(ctx.COLOR().size() > 0){
                            String colorText = ctx.COLOR().get(0).getText();
                            genericGame.setSpriteColor(wordText,colorText);
                        }
                        if(ctx.SOLID().size() > 0){
                            String solidText = ctx.SOLID().get(0).getText();
                            genericGame.setSpriteSoild(wordText,Boolean.parseBoolean(solidText));
                        }
                    }catch(Exception e){

                    }
                }
            }

            @Override
            public void exitCounter(SGL2DParser.CounterContext ctx){
                int counterNum = Integer.parseInt(ctx.getText().substring(6,7));
                if(ctx.BOOLEAN().size() > 0){
                    // TODO: Need to add boolean for Counter
                    String boolText = ctx.BOOLEAN().get(0).getText();
                    switch(counterNum){
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        default:
                    }
                }
                if(ctx.INT().size() > 0){
                    int intText = Integer.parseInt(ctx.INT().get(0).getText());
                    switch(counterNum){
                        case 1:
                            genericGame.setValueCounter1(intText);
                            break;
                        case 2:
                            genericGame.setValueCounter2(intText);
                            break;
                        case 3:
                            genericGame.setValueCounter3(intText);
                            break;
                        default:
                    }
                }
            }

            @Override
            public void exitEvent(SGL2DParser.EventContext ctx){
                if(ctx.WORD() != null){
                    String spriteText = ctx.WORD().getText();
                    if(ctx.COMMAND().size()> 0){
                        String commandText = ctx.COMMAND().get(0).getText();
                        genericGame.setSpriteCommand(spriteText,commandText);
                    }
                }
                else{
                    String commandText = ctx.COMMAND().get(0).getText();
                    genericGame.setGoalCommand(commandText);
                }
            }

            @Override
            public void exitSet(SGL2DParser.SetContext ctx){

            }

            @Override
            public void exitPosition(SGL2DParser.PositionContext ctx){

            }

            @Override
            public void exitRange(SGL2DParser.RangeContext ctx){

            }

        });
        parser.start();

        return genericGame;
    }
}
