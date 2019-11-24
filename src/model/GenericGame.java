package model;

import javafx.util.Pair;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

/**
 * Generic Game class
 */
public class GenericGame extends Observable {
    public static final Random RND = new Random();
    private static final int GAME_WIDTH = 600;
    private static final int GAME_HEIGHT = 600;
    private static int COLUMNS = 10;
    private static int ROWS = 10;
    private static long START_TIME;
    private static long END_TIME;

    private List<Sprite> sprites;
    private List<List<Sprite>> gridPositions;
    private Player player;
    private Goal goal;
    private Observable observers;
    private Boolean isGameOver;
    private Boolean isVictory;
    private int valueCounter1;
    private int valueCounter2;
    private int valueCounter3;
    private Boolean playerIncCounter1Flag;
    private Boolean playerIncCounter2Flag;
    private Boolean playerIncCounter3Flag;
    private Boolean playerDecCounter1Flag;
    private Boolean playerDecCounter2Flag;
    private Boolean playerDecCounter3Flag;
    private int playerIncValue1;
    private int playerIncValue2;
    private int playerIncValue3;
    private int playerDecValue1;
    private int playerDecValue2;
    private int playerDecValue3;
    private Boolean counter1WinOnZero;
    private Boolean counter2WinOnZero;
    private Boolean counter3WinOnZero;
    private Boolean counter1GameOverOnZero;
    private Boolean counter2GameOverOnZero;
    private Boolean counter3GameOverOnZero;

    /**
     * Constructor for a GenericGame
     */
    public GenericGame() {
        sprites = new ArrayList<Sprite>();
        gridPositions = new ArrayList<>();
        Sprite tempS = new Sprite("g10492");
        tempS.setColor("black");
        for (int i = 0; i < ROWS; i++) {
            ArrayList<Sprite> temp = new ArrayList<>();
            for (int j = 0; j < COLUMNS; j++) {
                temp.add(tempS);
            }
            gridPositions.add(temp);
        }
        observers = new Observable();
        isGameOver = false;
        isVictory = false;
        valueCounter1 = 0;
        valueCounter2 = 0;
        valueCounter3 = 0;
        playerIncCounter1Flag = false;
        playerIncCounter2Flag = false;
        playerIncCounter3Flag = false;
        playerDecCounter1Flag = false;
        playerDecCounter2Flag = false;
        playerDecCounter3Flag = false;
        playerIncValue1 = 0;
        playerIncValue2 = 0;
        playerIncValue3 = 0;
        playerDecValue1 = 0;
        playerDecValue2 = 0;
        playerDecValue3 = 0;
        counter1WinOnZero = false;
        counter2WinOnZero = false;
        counter3WinOnZero = false;
        counter1GameOverOnZero = false;
        counter2GameOverOnZero = false;
        counter3GameOverOnZero = false;
        START_TIME = System.currentTimeMillis();
    }

    /**
     * Updates game parameters, notifies observers, and repaints panel.
     */
    public void update() {
        for (int j = 0; j < COLUMNS; j++) {
            for (int i = 0; i < ROWS; i++) {
                Sprite eventSprite = gridPositions.get(j).get(i);
                if (eventSprite.eventTransformOnZeroCounterFlag.equals(true) && eventSprite.getSpriteCounter() == 0) {
                    gridPositions.get(j).set(i, findSprite(eventSprite.getEventNewSprite()));
                }
                if (eventSprite.eventGameOverOnZeroCounterFlag.equals(true)) {
                    if (eventSprite.getSpriteCounter() == 0) {
                        isGameOver = true;
                        END_TIME = System.currentTimeMillis();
                    }
                }
                if (eventSprite.eventWinOnZeroCounterFlag.equals(true)) {
                    if (eventSprite.getSpriteCounter() == 0) {
                        isVictory = true;
                        END_TIME = System.currentTimeMillis();
                    }
                }
                if (eventSprite.eventPlayerIncCounterFlag.equals(true)) {
                    eventSprite.setSpriteCounter(eventSprite.getSpriteCounter() + eventSprite.getPlayerIncCounter());
                }
                if (eventSprite.eventPlayerDecCounterFlag.equals(true)) {
                    eventSprite.setSpriteCounter(eventSprite.getSpriteCounter() - eventSprite.getPlayerDecCounter());
                }
                if (eventSprite.eventMoveToRandomOnZeroFlag.equals(true) && eventSprite.getSpriteCounter() == 0) {
                    eventSprite.setSpriteCounter(eventSprite.getInitialSpriteCounter());
                    if (containsSprite(eventSprite.getEventNewSprite())) {
                        gridPositions.get(j).set(i, findSprite(eventSprite.getEventNewSprite()));
                        int tryCounter = 10;
                        while (tryCounter != 0) {
                            int xRand = RND.nextInt(ROWS);
                            int yRand = RND.nextInt(COLUMNS);
                            if (gridPositions.get(xRand).get(yRand).getName().toLowerCase().equals(eventSprite.getEventNewSprite())) {
                                gridPositions.get(xRand).set(yRand, eventSprite);
                                break;
                            }
                            tryCounter -= 1;
                        }
                    }
                }
            }
        }
        if (counter1WinOnZero) {
            if (valueCounter1 == 0) {
                isVictory = true;
                END_TIME = System.currentTimeMillis();
            }
        }
        if (counter2WinOnZero) {
            if (valueCounter2 == 0) {
                isVictory = true;
                END_TIME = System.currentTimeMillis();
            }
        }
        if (counter3WinOnZero) {
            if (valueCounter3 == 0) {
                isVictory = true;
                END_TIME = System.currentTimeMillis();
            }
        }
        if (counter1GameOverOnZero) {
            if (valueCounter1 == 0) {
                isGameOver = true;
                END_TIME = System.currentTimeMillis();
            }
        }
        if (counter2GameOverOnZero) {
            if (valueCounter2 == 0) {
                isGameOver = true;
                END_TIME = System.currentTimeMillis();
            }
        }
        if (counter3GameOverOnZero) {
            if (valueCounter3 == 0) {
                isGameOver = true;
                END_TIME = System.currentTimeMillis();
            }
        }
        if (goal != null) {
            if (player.getxCoord() == goal.getxCoord() & player.getyCoord() == goal.getyCoord()) {
                isVictory = true;
                END_TIME = System.currentTimeMillis();
            }
        }
        setChanged();
        notifyObservers();
        // If implementing resets:
        // checkVictory(); // NOTE: NOT THE SAME AS isVICTORY, must notify all observers and end the game.
        // checkGameOver(); // NOTE: See above
    }

    /**
     * KeyEvent listener for the game with basic arrow key listeners and an exit through escape.
     * @param keyCode Key press input
     */
    public void keyPressed(int keyCode) { // ** Probably change to only on down button unless an delay is added. Update changed when
        if (!isGameOver & !isVictory) {
            if (keyCode == KeyEvent.VK_KP_LEFT || keyCode == KeyEvent.VK_LEFT) {
                movePlayer("LEFT");
                update();
            } else if (keyCode == KeyEvent.VK_KP_RIGHT || keyCode == KeyEvent.VK_RIGHT) {
                movePlayer("RIGHT");
                update();
            } else if (keyCode == KeyEvent.VK_KP_UP || keyCode == KeyEvent.VK_UP) {
                movePlayer("UP");
                update();
            } else if (keyCode == KeyEvent.VK_KP_DOWN || keyCode == KeyEvent.VK_DOWN) {
                movePlayer("DOWN");
                update();
            } else if (keyCode == KeyEvent.VK_ESCAPE)
                System.exit(0);
        }
    }

    /**
     * Handles
     * @param g panel to paint over
     */
    public void paint(Graphics g) {
        //int columnSize = gridPositions.size();
        //int rowSize = gridPositions.get(0).size();

        int columnSize = COLUMNS;
        int rowSize = ROWS;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                Pair<Integer, Integer> position = convertGridCoordinates(j, i);
                if (gridPositions.get(j).get(i) != null) {
                    gridPositions.get(j).get(i).paint(g, position.getKey(), position.getValue());
                }
            }
        }
        if (goal != null) {
            goal.paint(g);
        }
        if (player != null) {
            player.paint(g);
        }
    }

    /**
     * Adds a new sprite to sprites if it exists otherwise do nothing.
     * @param name Name of the new sprite
     * @throws Exception If the name of the sprite is "goal" or player", throws IllegalArgumentException
     */
    public void addSprite(String name) throws Exception {
        if (name.toLowerCase().equals("goal") || name.toLowerCase().equals("player")) {
            throw new IllegalArgumentException("Invalid Arguments: Cannot name sprite: " + name + ".");
        }

        if (!containsSprite(name)) {
            sprites.add(new Sprite(name.toLowerCase()));
        }
    }

    /**
     * Creates a new Player if player is not null.
     */
    public void createPlayer() {
        if (player == null) {
            player = new Player("player");
        }
    }

    /**
     * Creates a new Goal if goal is not null.
     */
    public void createGoal() {
        if (goal == null) {
            goal = new Goal("goal");
        }
    }

    /**
     * Checks if the game is over.
     * @return isGameOver
     */
    public Boolean isGameOver() {
        return isGameOver;
    }

    /**
     * Checks if the game won.
     * @return isVictory
     */
    public Boolean isVictory() {
        return isVictory;
    }

    public Goal getGoal () {
        return goal;
    }

    public Player getPlayer () {
        return player;
    }

    public static long getStartTime() {
        return START_TIME;
    }

    public static long getEndTime() {
        return END_TIME;
    }

    /**
     * Getter for valueCounter1.
     * @return valueCounter1
     */
    public String getStringCounter1() {
        return Integer.toString(valueCounter1);
    }

    /**
     * Getter for valueCounter2.
     * @return valueCounter2
     */
    public String getStringCounter2() {
        return Integer.toString(valueCounter2);
    }

    /**
     * Getter for valueCounter3.
     * @return valueCounter3
     */
    public String getStringCounter3() {
        return Integer.toString(valueCounter3);
    }

    /**
     * Setter for valueCounter1.
     * @param value the value to set valueCounter1 to
     */
    public void setValueCounter1(int value) {
        valueCounter1 = value;
    }

    /**
     * Setter for valueCounter2.
     * @param value the value to set valueCounter2 to
     */
    public void setValueCounter2(int value) {
        valueCounter2 = value;
    }

    /**
     * Setter for valueCounter3.
     * @param value the value to set valueCounter3 to
     */
    public void setValueCounter3(int value) {
        valueCounter3 = value;
    }

    public void setPlayerIncCounter1Flag(Boolean playerIncCounter1Flag) {
        this.playerIncCounter1Flag = playerIncCounter1Flag;
    }

    public void setPlayerIncCounter2Flag(Boolean playerIncCounter2Flag) {
        this.playerIncCounter2Flag = playerIncCounter2Flag;
    }

    public void setPlayerIncCounter3Flag(Boolean playerIncCounter3Flag) {
        this.playerIncCounter3Flag = playerIncCounter3Flag;
    }

    public void setPlayerDecCounter1Flag(Boolean playerDecCounter1Flag) {
        this.playerDecCounter1Flag = playerDecCounter1Flag;
    }

    public void setPlayerDecCounter2Flag(Boolean playerDecCounter2Flag) {
        this.playerDecCounter2Flag = playerDecCounter2Flag;
    }

    public void setPlayerDecCounter3Flag(Boolean playerDecCounter3Flag) {
        this.playerDecCounter3Flag = playerDecCounter3Flag;
    }

    public void setPlayerIncValue1(int playerIncValue1) {
        this.playerIncValue1 = playerIncValue1;
    }

    public void setPlayerIncValue2(int playerIncValue2) {
        this.playerIncValue2 = playerIncValue2;
    }

    public void setPlayerIncValue3(int playerIncValue3) {
        this.playerIncValue3 = playerIncValue3;
    }

    public void setPlayerDecValue1(int playerDecValue1) {
        this.playerDecValue1 = playerDecValue1;
    }

    public void setPlayerDecValue2(int playerDecValue2) {
        this.playerDecValue2 = playerDecValue2;
    }

    public void setPlayerDecValue3(int playerDecValue3) {
        this.playerDecValue3 = playerDecValue3;
    }

    public void setCounter1WinOnZero(Boolean counter1WinOnZero) {
        this.counter1WinOnZero = counter1WinOnZero;
    }

    public void setCounter2WinOnZero(Boolean counter2WinOnZero) {
        this.counter2WinOnZero = counter2WinOnZero;
    }

    public void setCounter3WinOnZero(Boolean counter3WinOnZero) {
        this.counter3WinOnZero = counter3WinOnZero;
    }

    public void setCounter1GameOverOnZero(Boolean counter1GameOverOnZero) {
        this.counter1GameOverOnZero = counter1GameOverOnZero;
    }

    public void setCounter2GameOverOnZero(Boolean counter2GameOverOnZero) {
        this.counter2GameOverOnZero = counter2GameOverOnZero;
    }

    public void setCounter3GameOverOnZero(Boolean counter3GameOverOnZero) {
        this.counter3GameOverOnZero = counter3GameOverOnZero;
    }

    /**
     * Finds a sprite given the name in sprites if it exists otherwise return null.
     * @param name the name of the sprite to find
     * @return the sprite matching the name or null
     */
    public Sprite findSprite(String name) {
        if (sprites == null) {
            return null;
        }

        for (Sprite aSprite : sprites) {
            if (aSprite.getName().equals(name.toLowerCase())) {
                return aSprite;
            }
        }
        return null;
    }

    /**
     * Checks if sprites contains a given sprite name.
     * @param name the name of the sprite to find
     * @return true or false
     */
    public Boolean containsSprite(String name) {
        if (sprites == null) {
            return false;
        }

        for (Sprite aSprite : sprites) {
            if (aSprite.getName().equals(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Sets the sprite onto the grid
     * @param sprite sprite to add to grid
     * @param xPos x-position
     * @param yPos y-position
     */
    // If time, make these into exceptions then handle with a try/catch block in exitSet.
    public void setGridSprite(Sprite sprite, int xPos, int yPos) {
        if (xPos > COLUMNS - 1) {
            return;
        }
        if (yPos > ROWS - 1) {
            return;
        }
        if (sprite != null) {
            gridPositions.get(xPos).set(yPos, sprite);
        }
    }

    /**
     * Converts given grid coordinates to position coordinates in the GamePanel.
     * @param xPos x-position in grid coordinates
     * @param yPos y-position in grid coordinates
     * @return a Pair containing x-coordinate and y-coordinate
     */
    public Pair<Integer,Integer> convertGridCoordinates(int xPos, int yPos) {
        return new Pair<Integer,Integer>(xPos*(GAME_WIDTH/COLUMNS),yPos*(GAME_HEIGHT/ROWS));
    }

    /**
     * Converts given position coordinates to grid coordinates in the GenericGame.
     * @param xCoord x-coordinate
     * @param yCoord y-coordinate
     * @return a Pair containing x-position and y-position
     */
    private Pair<Integer,Integer> convertToGridCoordinates(int xCoord, int yCoord) {
        return new Pair<Integer,Integer>(xCoord/(GAME_WIDTH/COLUMNS),yCoord/(GAME_HEIGHT/ROWS));
    }

    /**
     * KeyHandler for arrow key movement.
     * @param direction the string containing the direction to move the player
     */
    private void movePlayer(String direction) {
        Pair<Integer,Integer> playerPos = convertToGridCoordinates(player.getxCoord(), player.getyCoord());
        Boolean moved = false;
        switch(direction) {
            case("LEFT"):
                if (checkBoundary(playerPos.getKey()-1, playerPos.getValue())) {
                    if (checkLocationMovable(playerPos.getKey()-1, playerPos.getValue())) {
                        Pair<Integer,Integer> playerCoord = convertGridCoordinates(playerPos.getKey()-1, playerPos.getValue());
                        player.setxCoord(playerCoord.getKey());
                        player.setyCoord(playerCoord.getValue());
                        performSpriteEvents(playerPos.getKey()-1, playerPos.getValue());
                        moved = true;
                    }
                }
                break;
            case("RIGHT"):
                if (checkBoundary(playerPos.getKey()+1, playerPos.getValue())) {
                    if (checkLocationMovable(playerPos.getKey()+1, playerPos.getValue())) {
                        Pair<Integer,Integer> playerCoord = convertGridCoordinates(playerPos.getKey()+1, playerPos.getValue());
                        player.setxCoord(playerCoord.getKey());
                        player.setyCoord(playerCoord.getValue());
                        performSpriteEvents(playerPos.getKey()+1, playerPos.getValue());
                        moved = true;
                    }
                }
                break;
            case("DOWN"):
                if (checkBoundary(playerPos.getKey(), playerPos.getValue()+1)) {
                    if (checkLocationMovable(playerPos.getKey(), playerPos.getValue()+1)) {
                        Pair<Integer,Integer> playerCoord = convertGridCoordinates(playerPos.getKey(), playerPos.getValue()+1);
                        player.setxCoord(playerCoord.getKey());
                        player.setyCoord(playerCoord.getValue());
                        performSpriteEvents(playerPos.getKey(), playerPos.getValue()+1);
                        moved = true;
                    }
                }
                break;
            case("UP"):
                if (checkBoundary(playerPos.getKey(), playerPos.getValue()-1)) {
                    if (checkLocationMovable(playerPos.getKey(), playerPos.getValue()-1)) {
                        Pair<Integer,Integer> playerCoord = convertGridCoordinates(playerPos.getKey(), playerPos.getValue()-1);
                        player.setxCoord(playerCoord.getKey());
                        player.setyCoord(playerCoord.getValue());
                        performSpriteEvents(playerPos.getKey(), playerPos.getValue()-1);
                        moved = true;
                    }
                }
                break;
        }
        if (moved) {
            if (playerIncCounter1Flag) {
                valueCounter1 += playerIncValue1;
            }
            if (playerIncCounter2Flag) {
                valueCounter2 += playerIncValue2;
            }
            if (playerIncCounter3Flag) {
                valueCounter3 += playerIncValue3;
            }
            if (playerDecCounter1Flag) {
                valueCounter1 -= playerDecValue1;
            }
            if (playerDecCounter2Flag) {
                valueCounter2 -= playerDecValue2;
            }
            if (playerDecCounter3Flag) {
                valueCounter3 -= playerDecValue3;
            }
        }
    }

    /**
     * Checks if a given position coordinate is out of bounds.
     * @param xPos x-position
     * @param yPos y-position
     * @return true or false
     */
    private Boolean checkBoundary(int xPos, int yPos) {
        if (xPos < 0 || xPos > COLUMNS-1) {
            return false;
        }
        if (yPos < 0 || yPos > ROWS-1) {
            return false;
        }
        return true;
    }

    /**
     * Checks if a given position coordinate contains a sprite that is a solid.
     * @param xPos x-position
     * @param yPos y-position
     * @return true or false
     */
    private Boolean checkLocationMovable(int xPos, int yPos) {
        return !gridPositions.get(xPos).get(yPos).getSolid();
    }

    /**
     * SpriteHandler for sprite events after player movement.
     * @param xPos x-position
     * @param yPos y-position
     */
    private void performSpriteEvents(int xPos, int yPos) {
        Sprite eventSprite = gridPositions.get(xPos).get(yPos);
        if (eventSprite.eventIncCounter1Flag.equals(true)) {
            setValueCounter1(valueCounter1 + eventSprite.getIncCounter1());
        }
        if (eventSprite.eventDecCounter1Flag.equals(true)) {
            setValueCounter1(valueCounter1 - eventSprite.getDecCounter1());
        }
        if (eventSprite.eventIncCounter2Flag.equals(true)) {
            setValueCounter2(valueCounter2 + eventSprite.getIncCounter2());
        }
        if (eventSprite.eventDecCounter2Flag.equals(true)) {
            setValueCounter2(valueCounter2 - eventSprite.getDecCounter2());
        }
        if (eventSprite.eventIncCounter3Flag.equals(true)) {
            setValueCounter3(valueCounter3 + eventSprite.getIncCounter3());
        }
        if (eventSprite.eventDecCounter3Flag.equals(true)) {
            setValueCounter3(valueCounter3 - eventSprite.getDecCounter3());
        }
        if (eventSprite.eventIncSpriteCounterFlag.equals(true)) {
            eventSprite.setSpriteCounter(eventSprite.getSpriteCounter() + eventSprite.getIncSpriteCounter());
        }
        if (eventSprite.eventDecSpriteCounterFlag.equals(true)) {
            eventSprite.setSpriteCounter(eventSprite.getSpriteCounter() - eventSprite.getDecSpriteCounter());
        }
        if (eventSprite.eventMoveToRandomFlag.equals(true)) {
            if (eventSprite.getSpriteCounter() != 0) {
                eventSprite.setSpriteCounter(eventSprite.getInitialSpriteCounter());
            }
            if (containsSprite(eventSprite.getEventNewSprite())) {
                gridPositions.get(xPos).set(yPos, findSprite(eventSprite.getEventNewSprite()));
                int tryCounter = 10;
                while (tryCounter != 0) {
                    int xRand = RND.nextInt(ROWS);
                    int yRand = RND.nextInt(COLUMNS);
                    if (gridPositions.get(xRand).get(yRand).getName().toLowerCase().equals(eventSprite.getEventNewSprite())) {
                        gridPositions.get(xRand).set(yRand, eventSprite);
                        break;
                    }
                    tryCounter -= 1;
                }
            }
        }
        if (eventSprite.eventTransformToSpriteFlag.equals(true)) {
            gridPositions.get(xPos).set(yPos, findSprite(eventSprite.getEventNewSprite()));
        }
        if (eventSprite.eventMovePlayerToFlag.equals(true)) {
            Pair<Integer,Integer> temp = convertGridCoordinates(eventSprite.getMovePlayerToX(), eventSprite.getMovePlayerToY());
            player.setxCoord(temp.getKey());
            player.setyCoord(temp.getValue());
        }
        if (eventSprite.eventGameOverFlag.equals(true)) {
            isGameOver = true;
            END_TIME = System.currentTimeMillis();
        }
        if (eventSprite.eventWinFlag.equals(true)) {
            isVictory = true;
            END_TIME = System.currentTimeMillis();
        }
    }
}
