package leetcode;

public class MaximumSubarray {

  public int maxSubArray(int[] nums) {
    int res = Integer.MIN_VALUE;
    int assi = 0;
    for (int num : nums) {
      assi += num;
      res = res > assi ? res : assi;
      assi = assi > 0 ? assi : 0;
    }

    return res;
  }
}
