package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ContainerWithMostWaterTest {

  @Test
  public void testMaxArea() {
    assertEquals(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
  }
}