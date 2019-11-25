package model;

import java.awt.*;
import java.util.Objects;

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
    protected int playerDecCounter;
    protected int playerIncCounter;
    protected String name;
    protected Color color;
    protected int initialSpriteCounter;
    protected Boolean eventPlayerDecCounterFlag;
    protected Boolean eventPlayerIncCounterFlag;
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
    protected Boolean eventMoveToRandomOnZeroFlag;
    protected Boolean eventTransformToSpriteFlag;
    protected Boolean eventMovePlayerToFlag;
    protected Boolean eventGameOverFlag;
    protected Boolean eventWinFlag;
    protected String eventNewSprite;

    /**
     * Default sprite class
     * @param name the name of the sprite
     */
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
        playerDecCounter = 0;
        playerIncCounter = 0;
        initialSpriteCounter = 0;
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
        eventMoveToRandomOnZeroFlag = false;
        eventTransformToSpriteFlag = false;
        eventMovePlayerToFlag = false;
        eventGameOverFlag = false;
        eventWinFlag = false;
        eventNewSprite = null;
        eventPlayerDecCounterFlag = false;
        eventPlayerIncCounterFlag = false;
    }

    /**
     * Abstract paint method
     * @param g the graphics to paint over
     */
    public abstract void paint(Graphics g);

    /**
     * Abstract paint method
     * @param g the graphics to paint over
     * @param xCoord starting xCoord to paint
     * @param yCoord starting yCoord to paint
     */
    public abstract void paint(Graphics g, int xCoord, int yCoord);

    /**
     * Getter for name
     * @return name
     */
    public String getName () {
        return name;
    }

    /**
     * Getter for color
     * @return color
     */
    public Color getColor () {
        return color;
    }

    /**
     * Setter for color based on ROYGBIV color scheme (see doc)
     * @param colorName the name of the color to set
     */
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
            case ("gray"):
                color = Color.GRAY;
                break;
            default:
                break;
        }
    }

    /**
     * Getter for eventNewSprite
     * @return eventNewSprite
     */
    public String getEventNewSprite() {
        return eventNewSprite;
    }

    /**
     * Setter for EventIncCounter1Flag
     * @param eventIncCounter1Flag true or false
     */
    public void setEventIncCounter1Flag(Boolean eventIncCounter1Flag) {
        this.eventIncCounter1Flag = eventIncCounter1Flag;
    }

    /**
     * Setter for EventDecCounter1Flag
     * @param eventDecCounter1Flag true or false
     */
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

    public void setEventMoveToRandomOnZeroFlag(Boolean eventMoveToRandomOnZeroFlag) {
        this.eventMoveToRandomOnZeroFlag = eventMoveToRandomOnZeroFlag;
    }

    public void setEventTransformToSpriteFlag(Boolean eventTransformToSpriteFlag) {
        this.eventTransformToSpriteFlag = eventTransformToSpriteFlag;
    }

    public void setEventPlayerDecCounterFlag(Boolean eventPlayerDecCounterFlag) {
        this.eventPlayerDecCounterFlag = eventPlayerDecCounterFlag;
    }

    public void setEventPlayerIncCounterFlag(Boolean eventPlayerIncCounterFlag) {
        this.eventPlayerIncCounterFlag = eventPlayerIncCounterFlag;
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

    public int getInitialSpriteCounter() {
        return initialSpriteCounter;
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

    public int getPlayerDecCounter() {
        return playerDecCounter;
    }

    public void setPlayerDecCounter(int playerDecCounter) {
        this.playerDecCounter = playerDecCounter;
    }

    public int getPlayerIncCounter() {
        return playerIncCounter;
    }

    public void setPlayerIncCounter(int playerIncCounter) {
        this.playerIncCounter = playerIncCounter;
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

    public void setInitialSpriteCounter(int initialSpriteCounter) {
        this.initialSpriteCounter = initialSpriteCounter;
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
