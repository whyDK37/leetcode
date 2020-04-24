package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TwoSumTest {

  @Test
  public void test() {
    TwoSum.Solution solution = new TwoSum.Solution();
    int[] ints = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
    assertEquals(ints[0], 0);
    assertEquals(ints[1], 1);
  }
}