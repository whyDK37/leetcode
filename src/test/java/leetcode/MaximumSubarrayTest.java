package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MaximumSubarrayTest {

  @Test
  public void testMaxSubArray() {
    MaximumSubarray maximumSubarray = new MaximumSubarray();

    assertEquals(maximumSubarray.maxSubArray(new int[]{-2, -1}), -1);
    assertEquals(maximumSubarray.maxSubArray(new int[]{4, -1, 2, 1}), 6);
    assertEquals(maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6);
  }
}