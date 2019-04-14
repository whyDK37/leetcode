package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class JumpGameTest {

    @Test
    public void testCanJump() {
        JumpGame jumpGame = new JumpGame();
        assertTrue(jumpGame.canJump(new int[]{2, 5, 0, 0}));
        assertTrue(jumpGame.canJump(new int[]{1}));
        assertTrue(jumpGame.canJump(new int[]{2, 0}));
        assertTrue(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(jumpGame.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}