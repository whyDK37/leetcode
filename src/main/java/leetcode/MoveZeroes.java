package leetcode;

public class MoveZeroes {

  public void moveZeroes(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return;
    }

    int start = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0 && start == i) {
        start++;
        continue;
      }
      if (nums[i] != 0) {
        int num = nums[i];
        nums[start++] = num;
        nums[i] = 0;
      }

    }

  }
}
