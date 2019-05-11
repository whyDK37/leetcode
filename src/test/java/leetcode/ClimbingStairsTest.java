package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(climbingStairs.climbStairs(2), 2);
        assertEquals(climbingStairs.climbStairs(3), 3);
    }
}