import SGL2DANTLR.SGL2DBaseListener;
import SGL2DANTLR.SGL2DLexer;
import SGL2DANTLR.SGL2DParser;
import javafx.util.Pair;
import model.GenericGame;
import model.Sprite;
import org.antlr.v4.runtime.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class GameFactory {
    public Pair<GenericGame, ArrayList<Boolean>> createGame (String filePath) throws IOException {
        GenericGame genericGame = new GenericGame();
        InputStream inputStream = new FileInputStream(filePath); //GameFactory.class.getResourceAsStream(filePath);
        SGL2DLexer lexer = new SGL2DLexer(CharStreams.fromStream(inputStream));
        SGL2DParser parser = new SGL2DParser(new CommonTokenStream(lexer));
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });

        ArrayList<Boolean> counterEnableFlags = new ArrayList<>();
        counterEnableFlags.add(false);
        counterEnableFlags.add(false);
        counterEnableFlags.add(false);

        // TODO: Finish rest of the cases
        parser.addParseListener(new SGL2DBaseListener() {
            @Override
            public void exitEnvironment(SGL2DParser.EnvironmentContext ctx) {
                // If implementing custom grid sizing:
                //String xText = ctx.XINT().get(ctx.XINT().size() - 1).getText();
                //String yText = ctx.YINT().get(ctx.YINT().size() - 1).getText();
                //genericGame.setRows(Integer.parseInt(xText.substring(2)));
                //genericGame.setColumns(Integer.parseInt(yText.substring(2)));
            }

            @Override
            public void exitGoal(SGL2DParser.GoalContext ctx) {
                String xText = "0";
                String yText = "0";
                String colorText = "yellow";

                if (ctx.XINT().size() != 0) {
                    xText = ctx.XINT().get(ctx.XINT().size() - 1).getText().substring(2);
                }
                if (ctx.YINT().size() != 0) {
                    yText = ctx.YINT().get(ctx.YINT().size() - 1).getText().substring(2);
                }
                if (ctx.COLOR().size() != 0) {
                    colorText = ctx.COLOR().get(ctx.COLOR().size() - 1).getText().substring(6);
                }
                genericGame.createGoal();
                Pair<Integer,Integer> temp = genericGame.convertGridCoordinates(Integer.parseInt(xText),Integer.parseInt(yText));
                genericGame.getGoal().setxCoord(temp.getKey());
                genericGame.getGoal().setyCoord(temp.getValue());
                genericGame.getGoal().setColor(colorText);
            }

            @Override
            public void exitPlayer(SGL2DParser.PlayerContext ctx) {
                String xText = "0";
                String yText = "0";
                String colorText = "yellow";

                if (ctx.XINT().size() != 0) {
                    xText = ctx.XINT().get(ctx.XINT().size() - 1).getText().substring(2);
                }
                if (ctx.YINT().size() != 0) {
                    yText = ctx.YINT().get(ctx.YINT().size() - 1).getText().substring(2);
                }
                if (ctx.COLOR().size() != 0) {
                    colorText = ctx.COLOR().get(ctx.COLOR().size() - 1).getText().substring(6);
                }
                genericGame.createPlayer();
                Pair<Integer,Integer> temp = genericGame.convertGridCoordinates(Integer.parseInt(xText),Integer.parseInt(yText));
                genericGame.getPlayer().setxCoord(temp.getKey());
                genericGame.getPlayer().setyCoord(temp.getValue());
                genericGame.getPlayer().setColor(colorText);
            }

            @Override
            public void exitSprite(SGL2DParser.SpriteContext ctx) {
                String nameText = "default";
                String solidText = "false";
                String colorText = "yellow";

                nameText = ctx.WORD().getText();
                if (ctx.SOLID().size() != 0) {
                    solidText = ctx.SOLID().get(ctx.SOLID().size() - 1).getText().substring(6);
                }
                if (ctx.COLOR().size() != 0) {
                    colorText = ctx.COLOR().get(ctx.COLOR().size() - 1).getText().substring(6);
                }

                try {
                    genericGame.addSprite(nameText);
                    genericGame.findSprite(nameText).setSolid(Boolean.parseBoolean(solidText));
                    genericGame.findSprite(nameText).setColor(colorText);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e);
                    System.out.println("Error: Cannot create a sprite with the name 'goal' or 'player'.");
                }
            }

            @Override
            public void exitCounter(SGL2DParser.CounterContext ctx) {
                String counterText = "1";
                String enableText = "false";
                String valueText = "0";
                String winText = "false";
                String gameOverText = "false";

                counterText = ctx.COUNTERINDEX().getText().substring(7);
                if (ctx.BOOLEAN().size() != 0) {
                    enableText = ctx.BOOLEAN().get(ctx.BOOLEAN().size() - 1).getText();
                }
                if (ctx.INT().size() != 0) {
                    valueText = ctx.INT().get(ctx.INT().size() - 1).getText();
                }
                if (ctx.WINONZERO().size() != 0) {
                    winText = "true";
                }
                if (ctx.GAMEOVERONZERO().size() != 0) {
                    gameOverText = "true";
                }

                if (counterText.equals("1")) {
                    counterEnableFlags.set(0, Boolean.parseBoolean(enableText));
                    genericGame.setValueCounter1(Integer.parseInt(valueText));
                    genericGame.setCounter1WinOnZero(Boolean.parseBoolean(winText));
                    genericGame.setCounter1GameOverOnZero(Boolean.parseBoolean(gameOverText));
                } else if (counterText.equals("2")) {
                    counterEnableFlags.set(1, Boolean.parseBoolean(enableText));
                    genericGame.setValueCounter2(Integer.parseInt(valueText));
                    genericGame.setCounter2WinOnZero(Boolean.parseBoolean(winText));
                    genericGame.setCounter2GameOverOnZero(Boolean.parseBoolean(gameOverText));
                } else if (counterText.equals("3")) {
                    counterEnableFlags.set(2, Boolean.parseBoolean(enableText));
                    genericGame.setValueCounter3(Integer.parseInt(valueText));
                    genericGame.setCounter3WinOnZero(Boolean.parseBoolean(winText));
                    genericGame.setCounter3GameOverOnZero(Boolean.parseBoolean(gameOverText));
                }

            }
            //EVENT WORD ARROW COMMAND*
            @Override
            public void exitEvent(SGL2DParser.EventContext ctx) {
                String nameText = "default";
                if (ctx.PLAYER() == null) {
                    nameText = ctx.WORD().getText();
                } else {
                    nameText = ctx.PLAYER().getText();
                }
                if (genericGame.containsSprite(nameText)) {
                    Sprite eventSprite = genericGame.findSprite(nameText);
                    for (int i = 0; i < ctx.action().size(); i++) {
                        String actionContext = ctx.action().get(i).getText();
                        if (actionContext.toLowerCase().equals("win")) {
                            eventSprite.setEventWinFlag(true);
                        } else if (actionContext.toLowerCase().equals("gameover")) {
                            eventSprite.setEventGameOverFlag(true);
                        } else if (actionContext.toLowerCase().equals("gameoveronzerocounter")) {
                            eventSprite.setEventGameOverOnZeroCounterFlag(true);
                        } else if (actionContext.toLowerCase().equals("winonzerocounter")) {
                            eventSprite.setEventWinOnZeroCounterFlag(true);
                        } else if (actionContext.length() >= 23 &&
                                actionContext.substring(0, 23).toLowerCase().equals("transformonzerocounter=")) {
                            eventSprite.setEventTransformOnZeroCounterFlag(true);
                            eventSprite.setEventNewSprite(actionContext.substring(23).toLowerCase());
                        } else if (actionContext.length() >= 23 &&
                                actionContext.substring(0, 23).toLowerCase().equals("playerdecspritecounter=")) {
                            eventSprite.setEventPlayerDecCounterFlag(true);
                            eventSprite.setPlayerDecCounter(Integer.parseInt(ctx.action().get(i).playerDecSpriteCounter().INT().get(ctx.action().get(i).playerDecSpriteCounter().INT().size()-1).getText()));
                        } else if (actionContext.length() >= 23 &&
                                actionContext.substring(0, 23).toLowerCase().equals("playerincspritecounter=")) {
                            eventSprite.setEventPlayerIncCounterFlag(true);
                            eventSprite.setPlayerIncCounter(Integer.parseInt(ctx.action().get(i).playerIncSpriteCounter().INT().get(ctx.action().get(i).playerIncSpriteCounter().INT().size()-1).getText()));
                        } else if (actionContext.length() >= 19 && actionContext.substring(0, 19).toLowerCase().equals("movetorandomonzero=")) {
                            eventSprite.setEventNewSprite(actionContext.substring(19).toLowerCase());
                            eventSprite.setEventMoveToRandomOnZeroFlag(true);
                        } else if (actionContext.length() >= 18 &&
                                actionContext.substring(0, 18).toLowerCase().equals("transformtosprite=")) {
                            eventSprite.setEventTransformToSpriteFlag(true);
                            eventSprite.setEventNewSprite(actionContext.substring(18).toLowerCase());
                        } else if (actionContext.length() >= 17 &&
                                actionContext.substring(0, 17).toLowerCase().equals("setspritecounter=")) {
                            eventSprite.setSpriteCounter(Integer.parseInt(actionContext.substring(17)));
                            eventSprite.setInitialSpriteCounter(Integer.parseInt(actionContext.substring(17)));
                        } else if (actionContext.length() >= 17 &&
                                actionContext.substring(0, 17).toLowerCase().equals("decspritecounter=")) {
                            eventSprite.setEventIncSpriteCounterFlag(true);
                            eventSprite.setDecSpriteCounter(Integer.parseInt(actionContext.substring(17)));
                        } else if (actionContext.length() >= 17 &&
                                actionContext.substring(0, 17).toLowerCase().equals("incspritecounter=")) {
                            eventSprite.setEventDecSpriteCounterFlag(true);
                            eventSprite.setIncSpriteCounter(Integer.parseInt(actionContext.substring(17)));
                        } else if (actionContext.length() >= 13 &&
                                actionContext.substring(0, 13).toLowerCase().equals("movetorandom=")) {
                            eventSprite.setEventMoveToRandomFlag(true);
                            eventSprite.setEventNewSprite(actionContext.substring(13).toLowerCase());
                        } else if (actionContext.length() >= 13 &&
                                actionContext.substring(0, 13).toLowerCase().equals("moveplayerto=")) {
                            String xText = "0";
                            String yText = "0";
                            if (ctx.action().get(i).movePlayerTo().XINT().size() != 0) {
                                xText = ctx.action().get(i).movePlayerTo().XINT().get(ctx.action().get(i).movePlayerTo().XINT().size() - 1).getText().substring(2);
                            }
                            if (ctx.action().get(i).movePlayerTo().YINT().size() != 0) {
                                yText = ctx.action().get(i).movePlayerTo().YINT().get(ctx.action().get(i).movePlayerTo().YINT().size() - 1).getText().substring(2);
                            }
                            eventSprite.setEventMovePlayerToFlag(true);
                            eventSprite.setMovePlayerToX(Integer.parseInt(xText));
                            eventSprite.setMovePlayerToY(Integer.parseInt(yText));
                        } else if (actionContext.length() >= 12 &&
                                actionContext.substring(0, 12).toLowerCase().equals("inccounter1=")) {
                            eventSprite.setEventIncCounter1Flag(true);
                            eventSprite.setIncCounter1(Integer.parseInt(actionContext.substring(12)));
                        } else if (actionContext.length() >= 12 &&
                                actionContext.substring(0, 12).toLowerCase().equals("inccounter2=")) {
                            eventSprite.setEventIncCounter2Flag(true);
                            eventSprite.setIncCounter2(Integer.parseInt(actionContext.substring(12)));
                        } else if (actionContext.length() >= 12 &&
                                actionContext.substring(0, 12).toLowerCase().equals("inccounter3=")) {
                            eventSprite.setEventIncCounter3Flag(true);
                            eventSprite.setIncCounter3(Integer.parseInt(actionContext.substring(12)));
                        } else if (actionContext.length() >= 12 &&
                                actionContext.substring(0, 12).toLowerCase().equals("deccounter1=")) {
                            eventSprite.setEventDecCounter1Flag(true);
                            eventSprite.setDecCounter1(Integer.parseInt(actionContext.substring(12)));
                        } else if (actionContext.length() >= 12 &&
                                actionContext.substring(0, 12).toLowerCase().equals("deccounter2=")) {
                            eventSprite.setEventDecCounter2Flag(true);
                            eventSprite.setDecCounter2(Integer.parseInt(actionContext.substring(12)));
                        } else if (actionContext.length() >= 12 &&
                                actionContext.substring(0, 12).toLowerCase().equals("deccounter3=")) {
                            eventSprite.setEventDecCounter3Flag(true);
                            eventSprite.setDecCounter3(Integer.parseInt(actionContext.substring(12)));
                        }
                    }
                } else if (nameText.toLowerCase().equals("player")) {
                    for (int i = 0; i < ctx.action().size(); i++) {
                        String actionContext = ctx.action().get(i).getText();
                        if (actionContext.length() >= 18 &&
                                actionContext.substring(0, 18).toLowerCase().equals("playerinccounter1=")) {
                            genericGame.setPlayerIncCounter1Flag(true);
                            genericGame.setPlayerIncValue1(Integer.parseInt(ctx.action().get(i).playerIncCounter1().INT().get(ctx.action().get(i).playerIncCounter1().INT().size()-1).getText()));
                        } else if (actionContext.length() >= 18 &&
                                actionContext.substring(0, 18).toLowerCase().equals("playerinccounter2=")) {
                            genericGame.setPlayerIncCounter2Flag(true);
                            genericGame.setPlayerIncValue2(Integer.parseInt(ctx.action().get(i).playerIncCounter2().INT().get(ctx.action().get(i).playerIncCounter2().INT().size()-1).getText()));
                        } else if (actionContext.length() >= 18 &&
                                actionContext.substring(0, 18).toLowerCase().equals("playerinccounter3=")) {
                            genericGame.setPlayerIncCounter3Flag(true);
                            genericGame.setPlayerIncValue3(Integer.parseInt(ctx.action().get(i).playerIncCounter3().INT().get(ctx.action().get(i).playerIncCounter3().INT().size()-1).getText()));
                        } else if (actionContext.length() >= 18 &&
                                actionContext.substring(0, 18).toLowerCase().equals("playerdeccounter1=")) {
                            genericGame.setPlayerDecCounter1Flag(true);
                            genericGame.setPlayerDecValue1(Integer.parseInt(ctx.action().get(i).playerDecCounter1().INT().get(ctx.action().get(i).playerDecCounter1().INT().size()-1).getText()));
                        } else if (actionContext.length() >= 18 &&
                                actionContext.substring(0, 18).toLowerCase().equals("playerdeccounter2=")) {
                            genericGame.setPlayerDecCounter2Flag(true);
                            genericGame.setPlayerDecValue2(Integer.parseInt(ctx.action().get(i).playerDecCounter2().INT().get(ctx.action().get(i).playerDecCounter2().INT().size()-1).getText()));
                        } else if (actionContext.length() >= 18 &&
                                actionContext.substring(0, 18).toLowerCase().equals("playerdeccounter3=")) {
                            genericGame.setPlayerDecCounter3Flag(true);
                            genericGame.setPlayerDecValue3(Integer.parseInt(ctx.action().get(i).playerDecCounter3().INT().get(ctx.action().get(i).playerDecCounter3().INT().size()-1).getText()));
                        }
                    }
                }
            }

            @Override
            public void exitSet(SGL2DParser.SetContext ctx) {
                String nameText = "default";
                nameText = ctx.WORD().getText();
                Sprite eventSprite = genericGame.findSprite(nameText);
                for (int i = 0; i < ctx.position().size(); i++) {
                    int xPos = Integer.parseInt(ctx.position().get(i).XINT().getText().substring(2));
                    int yPos = Integer.parseInt(ctx.position().get(i).YINT().getText().substring(2));
                    genericGame.setGridSprite(eventSprite, xPos, yPos);
                }
                for (int i = 0; i < ctx.range().size(); i++) {
                    int startX = Integer.parseInt(ctx.range().get(i).position().get(0).XINT().getText().substring(2));
                    int endX = Integer.parseInt(ctx.range().get(i).position().get(1).XINT().getText().substring(2));
                    int startY = Integer.parseInt(ctx.range().get(i).position().get(0).YINT().getText().substring(2));
                    int endY = Integer.parseInt(ctx.range().get(i).position().get(1).YINT().getText().substring(2));
                    for (int j = startX; j <= endX; j++) {
                        for (int k = startY; k <= endY; k++) {
                            genericGame.setGridSprite(eventSprite, j, k);
                        }
                    }
                }
            }
        });



        parser.start();

        Pair<GenericGame, ArrayList<Boolean>> returnValue = new Pair<>(genericGame, counterEnableFlags);
        return returnValue;
    }
}
