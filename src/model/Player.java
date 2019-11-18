package model;

import java.awt.*;

public class Player extends AbstractSprite {
    private int xCoord;
    private int yCoord;

    public Player (String name) {
        super(name);
        xCoord = 0;
        yCoord = 0;
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    @Override
    public void paint (Graphics g) {
        Color originalColor = g.getColor();
        g.setColor(color);
        g.fillRect(xCoord, yCoord, SPRITE_WIDTH, SPRITE_HEIGHT);
        g.setColor(originalColor);
    }

    @Override
    public void paint(Graphics g, int xCoord, int yCoord) {
        Color originalColor = g.getColor();
        g.setColor(color);
        g.fillRect(xCoord, yCoord, SPRITE_WIDTH, SPRITE_HEIGHT);
        g.setColor(originalColor);
    }
}
