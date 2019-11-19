package model;

import java.awt.*;

/**
 * Player sprite class
 */
public class Player extends AbstractSprite {
    private int xCoord;
    private int yCoord;

    /**
     * Constructor for the player, sets player name and defaults position to 0,0.
     * @param name the name of the player, default is to be "player"
     */
    public Player (String name) {
        super(name);
        xCoord = 0;
        yCoord = 0;
    }

    /**
     * Getter for x-coordinate.
     * @return xCoord
     */
    public int getxCoord() {
        return xCoord;
    }

    /**
     * Getter for y-coordinate.
     * @return yCoord
     */
    public int getyCoord() {
        return yCoord;
    }

    /**
     * Setter for x-coordinate
     * @param xCoord coordinate to set Player to
     */
    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    /**
     * Setter for y-coordinate.
     * @param yCoord coordinate to set Player to
     */
    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    /**
     * General paint method for painting over the panel.
     * @param g panel to paint over
     */
    @Override
    public void paint (Graphics g) {
        Color originalColor = g.getColor();
        g.setColor(color);
        g.fillRect(xCoord, yCoord, SPRITE_WIDTH, SPRITE_HEIGHT);
        g.setColor(originalColor);
    }

    /**
     * General paint method for painting over the panel.
     * @param g panel to paint over
     * @param xCoord x-coordinates to begin painting
     * @param yCoord y-coordinates to begin painting
     */
    @Override
    public void paint(Graphics g, int xCoord, int yCoord) {
        Color originalColor = g.getColor();
        g.setColor(color);
        g.fillRect(xCoord, yCoord, SPRITE_WIDTH, SPRITE_HEIGHT);
        g.setColor(originalColor);
    }
}
