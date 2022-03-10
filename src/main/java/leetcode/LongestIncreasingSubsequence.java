package leetcode;

/**
 * 300 https://leetcode-cn.com/problems/longest-increasing-subsequence/
 */
public class LongestIncreasingSubsequence {

  public int lengthOfLIS(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int[] dp = new int[nums.length];
    dp[0] = 1;
    int maxans = 1;
    for (int i = 1; i < nums.length; i++) {
      dp[i] = 1;
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
      maxans = Math.max(dp[i], maxans);
    }

    return maxans;
  }
}
