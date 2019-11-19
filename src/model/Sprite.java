package model;

import java.awt.*;

/**
 * General Sprite class
 */
public class Sprite extends AbstractSprite {

    private Boolean solid;

    /**
     * Constructor for the sprite, sets sprite name and defaults sprite to a non-solid object.
     * @param name the name of the sprite
     */
    public Sprite(String name) {
        super(name);
        solid = false;
    }

    /**
     * Getter for solid.
     * @return solid
     */
    public Boolean getSolid() {
        return solid;
    }

    /**
     * Setter for solid.
     * @param solid boolean to set solid to
     */
    public void setSolid(Boolean solid) {
        this.solid = solid;
    }

    /**
     * -- Should not be used ever --
     * @param g -- Should not be used ever --
     */
    @Override
    public void paint (Graphics g) {
        // Should never run this version on sprites
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
