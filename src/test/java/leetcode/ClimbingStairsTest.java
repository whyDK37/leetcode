package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ClimbingStairsTest {

  @Test
  public void testClimbStairs() {
    ClimbingStairs climbingStairs = new ClimbingStairs();
    assertEquals(climbingStairs.climbStairs(2), 2);
    assertEquals(climbingStairs.climbStairs(3), 3);
  }
}