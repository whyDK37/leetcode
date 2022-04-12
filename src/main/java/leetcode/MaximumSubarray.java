package leetcode;

/**
 * 53 https://leetcode-cn.com/problems/maximum-subarray/
 */
public class MaximumSubarray {

  public int maxSubArray(int[] nums) {
    int pre = 0, ans = nums[0];

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      pre = Math.max(pre + num, num);
      ans = Math.max(pre, ans);
    }
    return ans;
  }
}
