package model;

import javafx.util.Pair;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class GenericGame extends Observable {
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
    private int valueCounter1;
    private int valueCounter2;
    private int valueCounter3;

    public GenericGame() {
        sprites = new ArrayList<Sprite>();
        gridPositions = new ArrayList<>();
        for (int i = 0; i < ROWS; i++) {
            gridPositions.add(new ArrayList<>());
        }
        observers = new Observable();
        isGameOver = false;
        valueCounter1 = 0;
        valueCounter2 = 0;
        valueCounter3 = 0;
    }

    public void update() {
        // repaint game panel in game panel... (DONE)
        // setChanged();
        // notifyObservers();
        // checkWin();
        // checkGameOver();
    }

    public void keyPressed(int keyCode) { // ** Probably change to only on down button unless an delay is added. Update changed when
        if (keyCode == KeyEvent.VK_KP_LEFT || keyCode == KeyEvent.VK_LEFT) {
            movePlayer("LEFT");
            update();
        }
        else if (keyCode == KeyEvent.VK_KP_RIGHT || keyCode == KeyEvent.VK_RIGHT) {
            movePlayer("RIGHT");
            update();
        }
        else if (keyCode == KeyEvent.VK_KP_UP || keyCode == KeyEvent.VK_UP) {
            movePlayer("UP");
            update();
        }
        else if (keyCode == KeyEvent.VK_KP_DOWN || keyCode == KeyEvent.VK_DOWN) {
            movePlayer("DOWN");
            update();
        }
        else if (keyCode == KeyEvent.VK_ESCAPE)
            System.exit(0);
    }

    public void paint(Graphics g) {
        int columnSize = gridPositions.size();
        int rowSize = gridPositions.get(0).size();

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                Pair<Integer, Integer> position = convertGridCoordinates(j, i);
                gridPositions.get(i).get(j).paint(g,position.getKey(),position.getValue());
            }
        }
        goal.paint(g);
        player.paint(g);
    }

    public void addSprite(String name) throws Exception {
        if (name.toLowerCase().equals("goal") || name.toLowerCase().equals("player")) {
            throw new IllegalArgumentException("Invalid Arguments: Cannot name sprite: " + name + ".");
        }

        if (!containsSprite(name)) {
            sprites.add(new Sprite(name));
        }
    }

    public void createPlayer() {
        if (player == null) {
            player = new Player("player");
        }
    }

    public void createGoal() {
        if (goal == null) {
            goal = new Goal("goal");
        }
    }

    public Boolean isGameOver() {
        return isGameOver;
    }

    public int getValueCounter1() {
        return valueCounter1;
    }

    public int getValueCounter2() {
        return valueCounter2;
    }

    public int getValueCounter3() {
        return valueCounter3;
    }

    public void setValueCounter1(int value) {
        valueCounter1 = value;
    }

    public void setValueCounter2(int value) {
        valueCounter2 = value;
    }

    public void setValueCounter3(int value) {
        valueCounter3 = value;
    }

    private Sprite findSprite(String name) {
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

    private Boolean containsSprite(String name) {
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

    private Pair<Integer,Integer> convertGridCoordinates(int xPos, int yPos) {
        return new Pair<Integer,Integer>(xPos*GAME_WIDTH/COLUMNS,yPos*GAME_HEIGHT/ROWS);
    }

    private Pair<Integer,Integer> convertToGridCoordinates(int xCoord, int yCoord) {
        return new Pair<Integer,Integer>(xCoord/(GAME_WIDTH/COLUMNS),yCoord/(GAME_HEIGHT/ROWS));
    }

    private void movePlayer(String direction) {
        Pair<Integer,Integer> playerPos = convertToGridCoordinates(player.getxCoord(), player.getyCoord());
        switch(direction) {
            case("LEFT"):
                if (checkBoundary(playerPos.getKey(), playerPos.getValue())) {
                    if (checkLocationMovable(playerPos.getKey()-1, playerPos.getValue())) {
                        Pair<Integer,Integer> playerCoord = convertGridCoordinates(playerPos.getKey()-1, playerPos.getValue());
                        player.setxCoord(playerCoord.getKey());
                        player.setyCoord(playerCoord.getValue());
                        performSpriteEvents(playerPos.getKey(), playerPos.getValue()-1);
                    }
                }
                break;
            case("RIGHT"):
                if (checkBoundary(playerPos.getKey(), playerPos.getValue())) {
                    if (checkLocationMovable(playerPos.getKey()+1, playerPos.getValue())) {
                        Pair<Integer,Integer> playerCoord = convertGridCoordinates(playerPos.getKey()+1, playerPos.getValue());
                        player.setxCoord(playerCoord.getKey());
                        player.setyCoord(playerCoord.getValue());
                        performSpriteEvents(playerPos.getKey(), playerPos.getValue()-1);
                    }
                }
                break;
            case("DOWN"):
                if (checkBoundary(playerPos.getKey(), playerPos.getValue())) {
                    if (checkLocationMovable(playerPos.getKey(), playerPos.getValue()+1)) {
                        Pair<Integer,Integer> playerCoord = convertGridCoordinates(playerPos.getKey(), playerPos.getValue()+1);
                        player.setxCoord(playerCoord.getKey());
                        player.setyCoord(playerCoord.getValue());
                        performSpriteEvents(playerPos.getKey(), playerPos.getValue()-1);
                    }
                }
                break;
            case("UP"):
                if (checkBoundary(playerPos.getKey(), playerPos.getValue())) {
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

    private Boolean checkBoundary(int xPos, int yPos) {
        if (xPos < 0 || xPos > COLUMNS-1) {
            return false;
        }
        if (yPos < 0 || yPos > ROWS-1) {
            return false;
        }
        return true;
    }

    private Boolean checkLocationMovable(int xPos, int yPos) {
        return !gridPositions.get(xPos).get(yPos).getSolid();
    }

    private void performSpriteEvents(int xPos, int yPos) {
        Sprite eventSprite = gridPositions.get(xPos).get(yPos);
        if (eventSprite.eventIncCounter1Flag.equals(true)) {
            setValueCounter1(valueCounter1 + 1);
        }
        if (eventSprite.eventDecCounter1Flag.equals(true)) {
            setValueCounter1(valueCounter1 - 1);
        }
        if (eventSprite.eventIncCounter2Flag.equals(true)) {
            setValueCounter2(valueCounter2 + 1);
        }
        if (eventSprite.eventDecCounter2Flag.equals(true)) {
            setValueCounter2(valueCounter2 - 1);
        }
        if (eventSprite.eventIncCounter3Flag.equals(true)) {
            setValueCounter3(valueCounter2 + 1);
        }
        if (eventSprite.eventDecCounter3Flag.equals(true)) {
            setValueCounter3(valueCounter2 - 1);
        }
    }
}
