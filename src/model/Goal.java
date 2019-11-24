package model;

import java.awt.*;

/**
 * Goal sprite class
 */
public class Goal extends AbstractSprite {
    private int xCoord;
    private int yCoord;

    /**
     * Constructor for the goal, sets goal name and defaults position to 0,0.
     * @param name the name of the goal, default is to be "goal"
     */
    public Goal (String name) {
        super(name);
        this.xCoord = 0;
        this.yCoord = 0;
    }

    /**
     * Getter for x-coordinate.
     * @return xCoord
     */
    public int getxCoord() {
        return this.xCoord;
    }

    /**
     * Getter for y-coordinate.
     * @return yCoord
     */
    public int getyCoord() {
        return this.yCoord;
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
