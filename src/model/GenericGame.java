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
    }

    /**
     * Updates game parameters, notifies observers, and repaints panel.
     */
    public void update() {
        for (int j = 0; j < COLUMNS; j++) {
            for (int i = 0; i < ROWS; i++) {
                Sprite eventSprite = gridPositions.get(j).get(i);
                if (eventSprite.eventTransformOnZeroCounterFlag.equals(true)) {
                    gridPositions.get(j).set(i, findSprite(eventSprite.getEventNewSprite()));
                }
                if (eventSprite.eventGameOverOnZeroCounterFlag.equals(true)) {
                    if (eventSprite.getSpriteCounter() == 0) {
                        isGameOver = true;
                    }
                }
                if (eventSprite.eventWinOnZeroCounterFlag.equals(true)) {
                    if (eventSprite.getSpriteCounter() == 0) {
                        isGameOver = true;
                    }
                }
            }
        }
        if (player.getxCoord() == goal.getxCoord() & player.getyCoord() == goal.getyCoord()) {
            isVictory = true;
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
        switch(direction) {
            case("LEFT"):
                if (checkBoundary(playerPos.getKey()-1, playerPos.getValue())) {
                    if (checkLocationMovable(playerPos.getKey()-1, playerPos.getValue())) {
                        Pair<Integer,Integer> playerCoord = convertGridCoordinates(playerPos.getKey()-1, playerPos.getValue());
                        player.setxCoord(playerCoord.getKey());
                        player.setyCoord(playerCoord.getValue());
                        performSpriteEvents(playerPos.getKey()-1, playerPos.getValue());
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
                    }
                }
                break;
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
            setValueCounter3(valueCounter2 + eventSprite.getIncCounter3());
        }
        if (eventSprite.eventDecCounter3Flag.equals(true)) {
            setValueCounter3(valueCounter2 - eventSprite.getDecCounter3());
        }
        if (eventSprite.eventIncSpriteCounterFlag.equals(true)) {
            eventSprite.setSpriteCounter(eventSprite.getSpriteCounter() + eventSprite.getIncSpriteCounter());
        }
        if (eventSprite.eventDecSpriteCounterFlag.equals(true)) {
            eventSprite.setSpriteCounter(eventSprite.getSpriteCounter() - eventSprite.getDecSpriteCounter());
        }
        if (eventSprite.eventMoveToRandomFlag.equals(true)) {
            gridPositions.get(xPos).set(yPos, findSprite(eventSprite.getEventNewSprite()));
            gridPositions.get(RND.nextInt(ROWS)).set(RND.nextInt(COLUMNS), eventSprite);
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
        }
        if (eventSprite.eventWinFlag.equals(true)) {
            isVictory = true;
        }
    }
}
