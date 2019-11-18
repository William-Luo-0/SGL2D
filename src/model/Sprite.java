package model;

import java.awt.*;
import java.util.Objects;

public abstract class Sprite {
    protected static int SPRITE_WIDTH;
    protected static int SPRITE_HEIGHT;
    protected String name;
    protected Color color;

    public Sprite (String name) {
        this.name = name.toLowerCase();
        SPRITE_WIDTH = 60;
        SPRITE_HEIGHT = 60;
    }

    public abstract void paint(Graphics g);

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
        Sprite sprite = (Sprite) o;
        return name.equals(sprite.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
