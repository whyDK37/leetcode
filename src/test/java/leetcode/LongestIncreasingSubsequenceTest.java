package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LongestIncreasingSubsequenceTest {

  @Test
  public void testLengthOfLIS() {
    LongestIncreasingSubsequence subsequence = new LongestIncreasingSubsequence();
    assertEquals(4, subsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101}));
    assertEquals(4, subsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    assertEquals(4, subsequence.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    assertEquals(1, subsequence.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
  }
}