package tests;

import model.Goal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoalTest {
    private Goal goal;

    @BeforeEach
    public void runBefore() {
        goal = new Goal("goal");
    }

    @Test
    public void testConstructor() {
        assertEquals(goal.getName(), "goal");
        assertEquals(goal.getxCoord(), 0);
        assertEquals(goal.getyCoord(), 0);
    }

    @Test
    public void testSetxCoord() {
        goal.setxCoord(50);
        assertEquals(goal.getxCoord(), 50);
    }

    @Test
    public void testSetyCoord() {
        goal.setyCoord(50);
        assertEquals(goal.getyCoord(), 50);
    }
}
