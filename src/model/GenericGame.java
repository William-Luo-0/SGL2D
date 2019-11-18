package model;

import javafx.util.Pair;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

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
        move();
        checkGameOver();
    }

    public void keyPressed(int keyCode) {
        if (keyCode == KeyEvent.VK_KP_LEFT || keyCode == KeyEvent.VK_LEFT)
            player.moveLeft();
        else if (keyCode == KeyEvent.VK_KP_RIGHT || keyCode == KeyEvent.VK_RIGHT)
            player.moveRight();
        else if (keyCode == KeyEvent.VK_KP_UP || keyCode == KeyEvent.VK_UP)
            player.moveUp();
        else if (keyCode == KeyEvent.VK_KP_DOWN || keyCode == KeyEvent.VK_DOWN)
            player.moveDown();
        else if (keyCode == KeyEvent.VK_ESCAPE)
            System.exit(0);
    }

    public void paint(Graphics g) {
        for (Sprite aSprite: sprites)
            aSprite.paint(g);
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
}
