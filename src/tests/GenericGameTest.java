package tests;

import model.GenericGame;
import model.Goal;
import model.Player;
import model.Sprite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class GenericGameTest {
    private GenericGame genericGame;

    @BeforeEach
    public void runBefore() {
        genericGame = new GenericGame();
    }

    @Test
    public void testConstructor() {
        assertEquals(genericGame.getValueCounter1(), 0);
        assertEquals(genericGame.getValueCounter2(), 0);
        assertEquals(genericGame.getValueCounter3(), 0);
        assertFalse(genericGame.isGameOver());
        assertFalse(genericGame.isVictory());
        assertTrue(genericGame.getSprites().isEmpty());

        List<List<Sprite>> gridPositions = genericGame.getGridPositions();
        assertFalse(gridPositions.isEmpty());

        for (Sprite x : genericGame.getSprites())

            for (List<Sprite> gridList : gridPositions) {
                assertTrue(gridList.isEmpty());
            }
    }

    @Test
    public void testCreateGoal() {
        genericGame.createGoal();
        Goal goal = genericGame.getGoal();
        assertEquals(goal.getName(), "goal");
        assertEquals(goal.getxCoord(), 0);
        assertEquals(goal.getyCoord(), 0);
    }

    @Test
    public void testNullGoal() {
        assertNull(genericGame.getGoal());
    }

    @Test
    public void testCreatePlayer() {
        genericGame.createPlayer();
        Player player = genericGame.getPlayer();
        assertEquals(player.getName(), "player");
        assertEquals(player.getxCoord(), 0);
        assertEquals(player.getyCoord(), 0);
    }

    @Test
    public void testAddSpriteGoalException() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> {
            genericGame.addSprite("goal");
        });
    }

    @Test
    public void testAddSpritePlayerException() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> {
            genericGame.addSprite("player");
        });
    }

    @Test
    public void testAddSpriteSuccess() throws Exception {
        genericGame.addSprite("wall");
        assertTrue(genericGame.containsSprite("wall"));

        Sprite foundSprite = genericGame.findSprite("wall");
        Sprite newSprite = new Sprite("wall");
        assertEquals(foundSprite, newSprite);
    }

    @Test
    public void testSetValueCounter1() {
        assertEquals(genericGame.getValueCounter1(), 0);
        genericGame.setValueCounter1(1);
        assertEquals(genericGame.getValueCounter1(), 1);
    }

    @Test
    public void testSetValueCounter2() {
        assertEquals(genericGame.getValueCounter2(), 0);
        genericGame.setValueCounter2(2);
        assertEquals(genericGame.getValueCounter2(), 2);
    }

    @Test
    public void testSetValueCounter3() {
        assertEquals(genericGame.getValueCounter3(), 0);
        genericGame.setValueCounter3(3);
        assertEquals(genericGame.getValueCounter3(), 3);
    }
}
