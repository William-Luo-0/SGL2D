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

    /**
     * Setter for EventIncCounter2Flag
     * @param eventIncCounter2Flag true or false
     */
    public void setEventIncCounter2Flag(Boolean eventIncCounter2Flag) {
        this.eventIncCounter2Flag = eventIncCounter2Flag;
    }

    /**
     * Setter for EventDecCounter2Flag
     * @param eventDecCounter2Flag true or false
     */
    public void setEventDecCounter2Flag(Boolean eventDecCounter2Flag) {
        this.eventDecCounter2Flag = eventDecCounter2Flag;
    }

    /**
     * Setter for EventIncCounter3Flag
     * @param eventIncCounter3Flag true or false
     */
    public void setEventIncCounter3Flag(Boolean eventIncCounter3Flag) {
        this.eventIncCounter3Flag = eventIncCounter3Flag;
    }

    /**
     * Setter for EventDecCounter3Flag
     * @param eventDecCounter3Flag true or false
     */
    public void setEventDecCounter3Flag(Boolean eventDecCounter3Flag) {
        this.eventDecCounter3Flag = eventDecCounter3Flag;
    }

    /**
     * Setter for EventIncSpriteCounterFlag
     * @param eventIncSpriteCounterFlag true or false
     */
    public void setEventIncSpriteCounterFlag(Boolean eventIncSpriteCounterFlag) {
        this.eventIncSpriteCounterFlag = eventIncSpriteCounterFlag;
    }

    /**
     * Setter for EventDecSpriteCounterFlag
     * @param eventDecSpriteCounterFlag true or false
     */
    public void setEventDecSpriteCounterFlag(Boolean eventDecSpriteCounterFlag) {
        this.eventDecSpriteCounterFlag = eventDecSpriteCounterFlag;
    }

    /**
     * Setter for EventTransformOnZeroCounterFlag
     * @param eventTransformOnZeroCounterFlag true or false
     */
    public void setEventTransformOnZeroCounterFlag(Boolean eventTransformOnZeroCounterFlag) {
        this.eventTransformOnZeroCounterFlag = eventTransformOnZeroCounterFlag;
    }

    /**
     * Setter for EventGameOverOnZeroCounterFlag
     * @param eventGameOverOnZeroCounterFlag true or false
     */
    public void setEventGameOverOnZeroCounterFlag(Boolean eventGameOverOnZeroCounterFlag) {
        this.eventGameOverOnZeroCounterFlag = eventGameOverOnZeroCounterFlag;
    }

    /**
     * Setter for EventWinOnZeroCounterFlag
     * @param eventWinOnZeroCounterFlag true or false
     */
    public void setEventWinOnZeroCounterFlag(Boolean eventWinOnZeroCounterFlag) {
        this.eventWinOnZeroCounterFlag = eventWinOnZeroCounterFlag;
    }

    /**
     * Setter for EventMovePlayerToFlag
     * @param eventMovePlayerToFlag true or false
     */
    public void setEventMovePlayerToFlag(Boolean eventMovePlayerToFlag) {
        this.eventMovePlayerToFlag = eventMovePlayerToFlag;
    }

    /**
     * Setter for EventMoveToRandomFlag
     * @param eventMoveToRandomFlag true or false
     */
    public void setEventMoveToRandomFlag(Boolean eventMoveToRandomFlag) {
        this.eventMoveToRandomFlag = eventMoveToRandomFlag;
    }

    /**
     * Setter for EventMoveToRandomOnZeroFlag
     * @param eventMoveToRandomOnZeroFlag true or false
     */
    public void setEventMoveToRandomOnZeroFlag(Boolean eventMoveToRandomOnZeroFlag) {
        this.eventMoveToRandomOnZeroFlag = eventMoveToRandomOnZeroFlag;
    }

    /**
     * Setter for EventTransformToSpriteFlag
     * @param eventTransformToSpriteFlag true or false
     */
    public void setEventTransformToSpriteFlag(Boolean eventTransformToSpriteFlag) {
        this.eventTransformToSpriteFlag = eventTransformToSpriteFlag;
    }

    /**
     * Setter for EventPlayerDecCounterFlag
     * @param eventPlayerDecCounterFlag true or false
     */
    public void setEventPlayerDecCounterFlag(Boolean eventPlayerDecCounterFlag) {
        this.eventPlayerDecCounterFlag = eventPlayerDecCounterFlag;
    }

    /**
     * Setter for EventPlayerIncCounterFlag
     * @param eventPlayerIncCounterFlag true or false
     */
    public void setEventPlayerIncCounterFlag(Boolean eventPlayerIncCounterFlag) {
        this.eventPlayerIncCounterFlag = eventPlayerIncCounterFlag;
    }

    /**
     * Setter for EventGameOverFlag
     * @param eventGameOverFlag true or false
     */
    public void setEventGameOverFlag(Boolean eventGameOverFlag) {
        this.eventGameOverFlag = eventGameOverFlag;
    }

    /**
     * Setter for EventWinFlag
     * @param eventWinFlag true or false
     */
    public void setEventWinFlag(Boolean eventWinFlag) {
        this.eventWinFlag = eventWinFlag;
    }

    /**
     * Setter for EventNewSprite
     * @param eventNewSprite true or false
     */
    public void setEventNewSprite(String eventNewSprite) {
        this.eventNewSprite = eventNewSprite;
    }

    /**
     * Getter for MovePlayerToX
     * @return movePlayerToX
     */
    public int getMovePlayerToX () {
        return movePlayerToX;
    }

    /**
     * Getter for MovePlayerToY
     * @return movePlayerToY
     */
    public int getMovePlayerToY () {
        return movePlayerToY;
    }

    /**
     * Getter for SpriteCounter
     * @return spriteCounter
     */
    public int getSpriteCounter () {
        return spriteCounter;
    }

    /**
     * Getter for InitialSpriteCounter
     * @return initialSpriteCounter
     */
    public int getInitialSpriteCounter() {
        return initialSpriteCounter;
    }

    /**
     * Getter for IncSpriteCounter
     * @return incSpriteCounter
     */
    public int getIncSpriteCounter () {
        return incSpriteCounter;
    }

    /**
     * Getter for DecSpriteCounter
     * @return decSpriteCounter
     */
    public int getDecSpriteCounter () {
        return decSpriteCounter;
    }

    /**
     * Getter for IncCounter1
     * @return incCounter1
     */
    public int getIncCounter1() {
        return incCounter1;
    }

    /**
     * Getter for IncCounter2
     * @return incCounter2
     */
    public int getIncCounter2() {
        return incCounter2;
    }

    /**
     * Getter for IncCounter3
     * @return incCounter3
     */
    public int getIncCounter3() {
        return incCounter3;
    }

    /**
     * Getter for DecCounter1
     * @return decCounter1
     */
    public int getDecCounter1() {
        return decCounter1;
    }

    /**
     * Getter for DecCounter2
     * @return decCounter2
     */
    public int getDecCounter2() {
        return decCounter2;
    }

    /**
     * Getter for DecCounter3
     * @return decCounter3
     */
    public int getDecCounter3() {
        return decCounter3;
    }

    /**
     * Getter for PlayerDecCounter
     * @return playerDecCounter
     */
    public int getPlayerDecCounter() {
        return playerDecCounter;
    }

    /**
     * Setter for PlayerDecCounter
     * @param playerDecCounter the value to decrement player counter by
     */
    public void setPlayerDecCounter(int playerDecCounter) {
        this.playerDecCounter = playerDecCounter;
    }

    /**
     * Getter for PlayerIncCounter
     * @return playerIncCounter
     */
    public int getPlayerIncCounter() {
        return playerIncCounter;
    }

    /**
     * Setter for PlayerIncCounter
     * @param playerIncCounter the value to increment player counter by
     */
    public void setPlayerIncCounter(int playerIncCounter) {
        this.playerIncCounter = playerIncCounter;
    }

    /**
     * Setter for MovePlayerToX
     * @param value the x-position to move player to
     */
    public void setMovePlayerToX (int value) {
        movePlayerToX = value;
    }

    /**
     * Setter for MovePlayerToY
     * @param value the y-position to move player to
     */
    public void setMovePlayerToY (int value) {
        movePlayerToY = value;
    }

    /**
     * Setter for SpriteCounter
     * @param value the value to set the sprite counter to
     */
    public void setSpriteCounter (int value) {
        spriteCounter = value;
    }

    /**
     * Setter for InitialSpriteCounter
     * @param initialSpriteCounter the value to set the initial sprite counter to
     */
    public void setInitialSpriteCounter(int initialSpriteCounter) {
        this.initialSpriteCounter = initialSpriteCounter;
    }

    /**
     * Setter for IncSpriteCounter
     * @param value the value to set to
     */
    public void setIncSpriteCounter (int value) {
        incSpriteCounter = value;
    }

    /**
     * Setter for DecSpriteCounter
     * @param value the value to set to
     */
    public void setDecSpriteCounter (int value) {
        decSpriteCounter = value;
    }

    /**
     * Setter for IncCounter1
     * @param incCounter1 the value to set to
     */
    public void setIncCounter1(int incCounter1) {
        this.incCounter1 = incCounter1;
    }

    /**
     * Setter for IncCounter2
     * @param incCounter2 the value to set to
     */
    public void setIncCounter2(int incCounter2) {
        this.incCounter2 = incCounter2;
    }

    /**
     * Setter for IncCounter3
     * @param incCounter3 the value to set to
     */
    public void setIncCounter3(int incCounter3) {
        this.incCounter3 = incCounter3;
    }

    /**
     * Setter for DecCounter1
     * @param decCounter1 the value to set to
     */
    public void setDecCounter1(int decCounter1) {
        this.decCounter1 = decCounter1;
    }

    /**
     * Setter for DecCounter2
     * @param decCounter2 the value to set to
     */
    public void setDecCounter2(int decCounter2) {
        this.decCounter2 = decCounter2;
    }

    /**
     * Setter for DecCounter3
     * @param decCounter3 the value to set to
     */
    public void setDecCounter3(int decCounter3) {
        this.decCounter3 = decCounter3;
    }

    /**
     * Sprites equal if the name is equal
     * @param o comparison object
     * @return true or false
     */
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
