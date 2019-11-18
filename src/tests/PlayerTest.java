package tests;

import model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void runBefore() {
        player = new Player("player");
    }

    @Test
    public void testConstructor() {
        assertEquals(player.getName(), "player");
        assertEquals(player.getxCoord(), 0);
        assertEquals(player.getyCoord(), 0);
    }

    @Test
    public void testSetxCoord() {
        player.setxCoord(50);
        assertEquals(player.getxCoord(), 50);
    }

    @Test
    public void testSetyCoord() {
        player.setyCoord(50);
        assertEquals(player.getyCoord(), 50);
    }
}
