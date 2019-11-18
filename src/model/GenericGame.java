package model;

import javafx.util.Pair;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

// TODO: Add player and goal setters, they keep track of their position.

public class GenericGame extends Observable {
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
    }

    public void update() {
        checkGameOver();
    }

    public void keyPressed(int keyCode) {
        if (keyCode == KeyEvent.VK_KP_LEFT || keyCode == KeyEvent.VK_LEFT)
            movePlayer("LEFT");
        else if (keyCode == KeyEvent.VK_KP_RIGHT || keyCode == KeyEvent.VK_RIGHT)
            movePlayer("RIGHT");
        else if (keyCode == KeyEvent.VK_KP_UP || keyCode == KeyEvent.VK_UP)
            movePlayer("UP");
        else if (keyCode == KeyEvent.VK_KP_DOWN || keyCode == KeyEvent.VK_DOWN)
            movePlayer("DOWN");
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

        if (containsSprite(name)) {
            return;
        } else {
            sprites.add(new Sprite(name));
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
        return new Pair<Integer,Integer>(xPos*60,yPos*60);
    }

    private void movePlayer(String direction) {

    }
}
