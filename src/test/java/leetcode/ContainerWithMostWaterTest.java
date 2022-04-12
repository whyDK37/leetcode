package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ContainerWithMostWaterTest {

  @Test
  public void testMaxArea() {
    int i = 0;
    System.out.println(i++);
    assertEquals(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
  }

  @Test
  public void plus() {
    int i = 0;
    int j = i++;
    System.out.println(j);
  }
}