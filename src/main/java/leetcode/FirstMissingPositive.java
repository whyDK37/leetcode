package leetcode;

public class FirstMissingPositive {

  public int firstMissingPositive(int[] nums) {
    if (nums.length == 0) {
      return 1;
    }
    if (nums.length == 1 && nums[0] <= 0) {
      return 1;
    }

    int n = nums.length;
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      if (nums[i] > 0 && nums[i] <= n) {
        arr[nums[i] - 1] = 1;
      }
    }
    for (int i = 0; i < n; i++) {
      if (arr[i] != 1) {
        return i + 1;
      }
    }
    return n + 1;
  }
}
