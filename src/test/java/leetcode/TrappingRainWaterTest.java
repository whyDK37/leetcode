package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TrappingRainWaterTest {

    @Test
    public void testTrap() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        assertEquals(trappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), 6);
    }
}