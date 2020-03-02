package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MedianOfTwoSortedArraysTest {

  @Test
  public void test() {
    assertEquals(MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}),
        2.5D);
    assertEquals(MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}),
        2.0D);
  }
}