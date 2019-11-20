package model;

import java.awt.*;
import java.util.Objects;

// Add setter for Sprite Width and Height if we implementing custom grid sizes.
// TODO: ADD REST OF FLAGS AND CASES
// TODO: ADD TRACKER FOR SPRITE COUNTER (Here or in Sprite, design choice, better have a good reason for choosing which)
public abstract class AbstractSprite {
    protected static int SPRITE_WIDTH;
    protected static int SPRITE_HEIGHT;
    protected String name;
    protected Color color;
    protected Boolean eventIncCounter1Flag;
    protected Boolean eventDecCounter1Flag;
    protected Boolean eventIncCounter2Flag;
    protected Boolean eventDecCounter2Flag;
    protected Boolean eventIncCounter3Flag;
    protected Boolean eventDecCounter3Flag;
    protected Boolean eventMoveToRandomFlag;
    protected Boolean eventTransformToSpriteFlag;
    protected String eventNewSprite;


    public AbstractSprite(String name) {
        this.name = name.toLowerCase();
        this.color = Color.DARK_GRAY;
        SPRITE_WIDTH = 60;
        SPRITE_HEIGHT = 60;
        eventIncCounter1Flag = false;
        eventDecCounter1Flag = false;
        eventIncCounter2Flag = false;
        eventDecCounter2Flag = false;
        eventIncCounter3Flag = false;
        eventDecCounter3Flag = false;
        eventMoveToRandomFlag = false;
        eventTransformToSpriteFlag = false;
        eventNewSprite = null;
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

    public Boolean getEventIncCounter1Flag() {
        return eventIncCounter1Flag;
    }

    public Boolean getEventDecCounter1Flag() {
        return eventDecCounter1Flag;
    }

    public Boolean getEventIncCounter2Flag() {
        return eventIncCounter2Flag;
    }

    public Boolean getEventDecCounter2Flag() {
        return eventDecCounter2Flag;
    }

    public Boolean getEventIncCounter3Flag() {
        return eventIncCounter3Flag;
    }

    public Boolean getEventDecCounter3Flag() {
        return eventDecCounter3Flag;
    }

    public Boolean getEventMoveToRandomFlag() {
        return eventMoveToRandomFlag;
    }

    public Boolean getEventTransformToSpriteFlag() {
        return eventTransformToSpriteFlag;
    }

    public String getEventNewSprite() {
        return eventNewSprite;
    }

    public void setEventIncCounter1Flag(Boolean eventIncCounter1Flag) {
        this.eventIncCounter1Flag = eventIncCounter1Flag;
    }

    public void setEventDecCounter1Flag(Boolean eventDecCounter1Flag) {
        this.eventDecCounter1Flag = eventDecCounter1Flag;
    }

    public void setEventIncCounter2Flag(Boolean eventIncCounter2Flag) {
        this.eventIncCounter2Flag = eventIncCounter2Flag;
    }

    public void setEventDecCounter2Flag(Boolean eventDecCounter2Flag) {
        this.eventDecCounter2Flag = eventDecCounter2Flag;
    }

    public void setEventIncCounter3Flag(Boolean eventIncCounter3Flag) {
        this.eventIncCounter3Flag = eventIncCounter3Flag;
    }

    public void setEventDecCounter3Flag(Boolean eventDecCounter3Flag) {
        this.eventDecCounter3Flag = eventDecCounter3Flag;
    }

    public void setEventMoveToRandomFlag(Boolean eventMoveToRandomFlag) {
        this.eventMoveToRandomFlag = eventMoveToRandomFlag;
    }

    public void setEventTransformToSpriteFlag(Boolean eventTransformToSpriteFlag) {
        this.eventTransformToSpriteFlag = eventTransformToSpriteFlag;
    }

    public void setEventNewSprite(String eventNewSprite) {
        this.eventNewSprite = eventNewSprite;
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
