package model;

import java.awt.*;
import java.util.Objects;

// Add setter for Sprite Width and Height if we implementing custom grid sizes.
public abstract class AbstractSprite {
    protected static int SPRITE_WIDTH;
    protected static int SPRITE_HEIGHT;
    private int spriteCounter;
    private int incSpriteCounter;
    private int decSpriteCounter;
    private int incCounter1;
    private int incCounter2;
    private int incCounter3;
    private int decCounter1;
    private int decCounter2;
    private int decCounter3;
    protected int movePlayerToX;
    protected int movePlayerToY;
    protected String name;
    protected Color color;
    protected Boolean eventIncCounter1Flag;
    protected Boolean eventDecCounter1Flag;
    protected Boolean eventIncCounter2Flag;
    protected Boolean eventDecCounter2Flag;
    protected Boolean eventIncCounter3Flag;
    protected Boolean eventDecCounter3Flag;
    protected Boolean eventIncSpriteCounterFlag;
    protected Boolean eventDecSpriteCounterFlag;
    protected Boolean eventTransformOnZeroCounterFlag;
    protected Boolean eventGameOverOnZeroCounterFlag;
    protected Boolean eventWinOnZeroCounterFlag;
    protected Boolean eventMoveToRandomFlag;
    protected Boolean eventTransformToSpriteFlag;
    protected Boolean eventMovePlayerToFlag;
    protected Boolean eventGameOverFlag;
    protected Boolean eventWinFlag;
    protected String eventNewSprite;


    public AbstractSprite(String name) {
        this.name = name.toLowerCase();
        this.color = Color.DARK_GRAY;
        SPRITE_WIDTH = 60;
        SPRITE_HEIGHT = 60;
        spriteCounter = 0;
        movePlayerToX = 0;
        movePlayerToY = 0;
        incCounter1 = 1;
        incCounter2 = 1;
        incCounter3 = 1;
        decCounter1 = 1;
        decCounter2 = 1;
        decCounter3 = 1;
        eventIncCounter1Flag = false;
        eventDecCounter1Flag = false;
        eventIncCounter2Flag = false;
        eventDecCounter2Flag = false;
        eventIncCounter3Flag = false;
        eventDecCounter3Flag = false;
        eventIncSpriteCounterFlag = false;
        eventDecSpriteCounterFlag = false;
        eventTransformOnZeroCounterFlag = false;
        eventGameOverOnZeroCounterFlag = false;
        eventWinOnZeroCounterFlag = false;
        eventMoveToRandomFlag = false;
        eventTransformToSpriteFlag = false;
        eventMovePlayerToFlag = false;
        eventGameOverFlag = false;
        eventWinFlag = false;
        eventNewSprite = null;
    }

    public abstract void paint(Graphics g);

    public abstract void paint(Graphics g, int xCoord, int yCoord);

    public String getName () {
        return name;
    }

    public Color getColor () {
        return color;
    }

    public void setColor (String colorName) {
        switch(colorName.toLowerCase()) {
            case ("red"):
                color = Color.RED;
                break;
            case ("orange"):
                color = Color.ORANGE;
                break;
            case ("yellow"):
                color = Color.YELLOW;
                break;
            case ("green"):
                color = Color.GREEN;
                break;
            case ("blue"):
                color = Color.BLUE;
                break;
            case ("indigo"):
                color = Color.CYAN;
                break;
            case ("violet"):
                color = Color.MAGENTA;
                break;
            case ("black"):
                color = Color.BLACK;
                break;
            case ("white"):
                color = Color.WHITE;
                break;
            case ("grey"):
                color = Color.GRAY;
                break;
            default:
                break;
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

    public Boolean getEventIncSpriteCounterFlag() {
        return eventIncSpriteCounterFlag;
    }

    public Boolean getEventDecSpriteCounterFlag() {
        return eventDecSpriteCounterFlag;
    }

    public Boolean getEventTransformOnZeroCounterFlag() {
        return eventTransformOnZeroCounterFlag;
    }

    public Boolean getEventGameOverOnZeroCounterFlag() {
        return eventGameOverOnZeroCounterFlag;
    }

    public Boolean getEventWinOnZeroCounterFlag() {
        return eventWinOnZeroCounterFlag;
    }

    public Boolean getEventMovePlayerToFlag() {
        return eventMovePlayerToFlag;
    }

    public Boolean getEventMoveToRandomFlag() {
        return eventMoveToRandomFlag;
    }

    public Boolean getEventTransformToSpriteFlag() {
        return eventTransformToSpriteFlag;
    }

    public Boolean getEventGameOverFlag() {
        return eventGameOverFlag;
    }

    public Boolean getEventWinFlag() {
        return eventWinFlag;
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

    public void setEventIncSpriteCounterFlag(Boolean eventIncSpriteCounterFlag) {
        this.eventIncSpriteCounterFlag = eventIncSpriteCounterFlag;
    }

    public void setEventDecSpriteCounterFlag(Boolean eventDecSpriteCounterFlag) {
        this.eventDecSpriteCounterFlag = eventDecSpriteCounterFlag;
    }

    public void setEventTransformOnZeroCounterFlag(Boolean eventTransformOnZeroCounterFlag) {
        this.eventTransformOnZeroCounterFlag = eventTransformOnZeroCounterFlag;
    }

    public void setEventGameOverOnZeroCounterFlag(Boolean eventGameOverOnZeroCounterFlag) {
        this.eventGameOverOnZeroCounterFlag = eventGameOverOnZeroCounterFlag;
    }

    public void setEventWinOnZeroCounterFlag(Boolean eventWinOnZeroCounterFlag) {
        this.eventWinOnZeroCounterFlag = eventWinOnZeroCounterFlag;
    }

    public void setEventMovePlayerToFlag(Boolean eventMovePlayerToFlag) {
        this.eventMovePlayerToFlag = eventMovePlayerToFlag;
    }

    public void setEventMoveToRandomFlag(Boolean eventMoveToRandomFlag) {
        this.eventMoveToRandomFlag = eventMoveToRandomFlag;
    }

    public void setEventTransformToSpriteFlag(Boolean eventTransformToSpriteFlag) {
        this.eventTransformToSpriteFlag = eventTransformToSpriteFlag;
    }

    public void setEventGameOverFlag(Boolean eventGameOverFlag) {
        this.eventGameOverFlag = eventGameOverFlag;
    }

    public void setEventWinFlag(Boolean eventWinFlag) {
        this.eventWinFlag = eventWinFlag;
    }

    public void setEventNewSprite(String eventNewSprite) {
        this.eventNewSprite = eventNewSprite;
    }

    public int getMovePlayerToX () {
        return movePlayerToX;
    }

    public int getMovePlayerToY () {
        return movePlayerToY;
    }

    public int getSpriteCounter () {
        return spriteCounter;
    }

    public int getIncSpriteCounter () {
        return incSpriteCounter;
    }

    public int getDecSpriteCounter () {
        return decSpriteCounter;
    }

    public int getIncCounter1() {
        return incCounter1;
    }

    public int getIncCounter2() {
        return incCounter2;
    }

    public int getIncCounter3() {
        return incCounter3;
    }

    public int getDecCounter1() {
        return decCounter1;
    }

    public int getDecCounter2() {
        return decCounter2;
    }

    public int getDecCounter3() {
        return decCounter3;
    }

    public void setMovePlayerToX (int value) {
        movePlayerToX = value;
    }

    public void setMovePlayerToY (int value) {
        movePlayerToY = value;
    }

    public void setSpriteCounter (int value) {
        spriteCounter = value;
    }

    public void setIncSpriteCounter (int value) {
        incSpriteCounter = value;
    }

    public void setDecSpriteCounter (int value) {
        decSpriteCounter = value;
    }

    public void setIncCounter1(int incCounter1) {
        this.incCounter1 = incCounter1;
    }

    public void setIncCounter2(int incCounter2) {
        this.incCounter2 = incCounter2;
    }

    public void setIncCounter3(int incCounter3) {
        this.incCounter3 = incCounter3;
    }

    public void setDecCounter1(int decCounter1) {
        this.decCounter1 = decCounter1;
    }

    public void setDecCounter2(int decCounter2) {
        this.decCounter2 = decCounter2;
    }

    public void setDecCounter3(int decCounter3) {
        this.decCounter3 = decCounter3;
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
