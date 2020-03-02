package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MinimumPathSumTest {

  @Test
  public void testMinPathSum() {
    MinimumPathSum minimumPathSum = new MinimumPathSum();

    assertEquals(minimumPathSum.minPathSum(new int[][]{
        {1, 3, 1},
        {1, 5, 1},
        {4, 2, 1}
    }), 7);
  }
}