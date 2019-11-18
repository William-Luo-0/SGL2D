package model;

import java.awt.*;

public class Sprite extends AbstractSprite {

    private Boolean solid;

    public Sprite(String name) {
        super(name);
        solid = false;
    }

    public Boolean getSolid() {
        return solid;
    }

    public void setSolid(Boolean solid) {
        this.solid = solid;
    }

    @Override
    public void paint (Graphics g) {
        // Should never run this version on sprites
    }

    @Override
    public void paint(Graphics g, int xCoord, int yCoord) {
        Color originalColor = g.getColor();
        g.setColor(color);
        g.fillRect(xCoord, yCoord, SPRITE_WIDTH, SPRITE_HEIGHT);
        g.setColor(originalColor);
    }
}
