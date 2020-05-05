package leetcode;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class LargestRectangleInHistogramTest {

  @Test
  public void testLargestRectangleArea() {
    LargestRectangleInHistogram rectangle = new LargestRectangleInHistogram();
    assertEquals(rectangle.largestRectangleArea(new int[]{0, 9}), 9);
    assertEquals(rectangle.largestRectangleArea(new int[]{}), 0);
    assertEquals(rectangle.largestRectangleArea(new int[]{2}), 2);
    assertEquals(rectangle.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}), 10);
  }
}