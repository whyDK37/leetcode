package leetcode;

import org.testng.annotations.Test;

public class CombinationSumTest {

  @Test
  public void testCombinationSum() {
    CombinationSum combinationSum = new CombinationSum();
    System.out.println(combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7));
    System.out.println(combinationSum.combinationSum(new int[]{2, 3, 5}, 8));
  }
}