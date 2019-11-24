package tests;

import model.Sprite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpriteTest {
    private Sprite sprite;

    @BeforeEach
    public void runBefore() {
        sprite = new Sprite("sprite");
    }

    @Test
    public void testConstructor() {
        assertEquals(sprite.getName(), "sprite");
        assertFalse(sprite.getSolid());
    }

    @Test
    public void testSetSolid() {
        sprite.setSolid(true);
        assertTrue(sprite.getSolid());
    }
}
