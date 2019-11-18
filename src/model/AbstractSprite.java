package model;

import java.awt.*;
import java.util.Objects;

// Add setter for Sprite Width and Height if we implementing custom grid sizes.

public abstract class AbstractSprite {
    protected static int SPRITE_WIDTH;
    protected static int SPRITE_HEIGHT;
    protected String name;
    protected Color color;

    public AbstractSprite(String name) {
        this.name = name.toLowerCase();
        this.color = Color.DARK_GRAY;
        SPRITE_WIDTH = 60;
        SPRITE_HEIGHT = 60;
    }

    public abstract void paint(Graphics g);

    public abstract void paint(Graphics g, int xCoord, int yCoord);

    public String getName () {
        return name;
    }

    public void setColor (String colorName) {
        switch(colorName.toLowerCase()) {
            case ("red"):
                color = Color.RED;
            case ("orange"):
                color = Color.ORANGE;
            case ("yellow"):
                color = Color.YELLOW;
            case ("green"):
                color = Color.GREEN;
            case ("blue"):
                color = Color.BLUE;
            case ("indigo"):
                color = Color.CYAN;
            case ("violet"):
                color = Color.MAGENTA;
            case ("black"):
                color = Color.BLACK;
            case ("white"):
                color = Color.WHITE;
            case ("grey"):
                color = Color.GRAY;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractSprite abstractSprite = (AbstractSprite) o;
        return name.equals(abstractSprite.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
