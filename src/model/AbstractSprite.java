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
    protected Boolean eventIncSpriteCounter;
    protected Boolean eventDecSpriteCounter;
    protected Boolean eventSetSpriteCounter;
    protected Boolean eventTransformOnZeroCounter;
    protected Boolean eventWinOnZeroCounter;
    protected Boolean eventMovePlayerTo;
    protected Boolean eventGameOver;
    protected Boolean eventWin;
    protected Boolean eventMoveToRandomFlag;
    protected Boolean eventTransformToSpriteFlag;
    protected String eventNewSprite;
    // All of its children can make use of the counter since there could be multiple sprites for goals and player
    protected int spriteCounter;


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
        eventIncSpriteCounter = false;
        eventDecSpriteCounter = false;
        eventSetSpriteCounter = false;
        eventTransformOnZeroCounter = false;
        eventWinOnZeroCounter = false;
        eventMovePlayerTo = false;
        eventGameOver = false;
        eventWin = false;
        eventNewSprite = null;
        spriteCounter = 0;
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

    public Boolean getEventIncSpriteCounter () {
        return eventIncSpriteCounter;
    }

    public Boolean getEventDecSpriteCounter() {
        return eventDecSpriteCounter;
    }

    public Boolean getEventSetSpriteCounter() {
        return eventSetSpriteCounter;
    }

    public Boolean getEventTransformOnZeroCounter() {
        return eventTransformOnZeroCounter;
    }

    public Boolean getEventWinOnZeroCounter() {
        return eventWinOnZeroCounter;
    }

    public Boolean getEventMovePlayerTo() {
        return eventMovePlayerTo;
    }

    public Boolean getEventGameOver() {
        return eventGameOver;
    }

    public Boolean getEventWin() {
        return eventWin;
    }

    public int getSpriteCounter() {
        return spriteCounter;
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

    public void setEventIncSpriteCounter(Boolean eventIncSpriteCounter){
        this.eventIncSpriteCounter = eventIncSpriteCounter;
    }

    public void setEventDecSpriteCounter(Boolean eventDecSpriteCounter){
        this.eventDecSpriteCounter = eventDecSpriteCounter;
    }

    public void setEventSetSpriteCounter(Boolean eventSetSpriteCounter){
        this.eventSetSpriteCounter = eventSetSpriteCounter;
    }

    public void setEventTransformOnZeroCounter(Boolean eventTransformOnZeroCounter){
        this.eventTransformOnZeroCounter = eventTransformOnZeroCounter;
    }

    public void setEventWinOnZeroCounter(Boolean eventWinOnZeroCounter){
        this.eventWinOnZeroCounter = eventWinOnZeroCounter;
    }

    public void setEventMovePlayerTo(Boolean eventMovePlayerTo){
        this.eventMovePlayerTo = eventMovePlayerTo;
    }

    public void setEventGameOver(Boolean eventGameOver){
        this.eventGameOver = eventGameOver;
    }

    public void setEventWin(Boolean eventWin){
        this.eventWin = eventWin;
    }

    public void setEventNewSprite(String eventNewSprite) {
        this.eventNewSprite = eventNewSprite;
    }

    public void setEventSpriteCounter(int EventSpriteCounter){
        this.spriteCounter = EventSpriteCounter;
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
