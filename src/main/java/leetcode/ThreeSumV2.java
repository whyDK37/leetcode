package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumV2 {

  public List<List<Integer>> threeSum(int[] nums) {
    if (nums == null || nums.length < 3) {
      return Collections.EMPTY_LIST;
    }
    List<List<Integer>> res = new ArrayList<>();

    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {

      // skip same number
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int left = i + 1, right = nums.length - 1;
      while (left < right) {

        int sum = nums[left] + nums[right] + nums[i];
        if (sum > 0) {
          right--;
        } else if (sum < 0) {
          left++;
        } else {

          List<Integer> integers = new ArrayList<>(3);
          integers.add(nums[i]);
          integers.add(nums[left]);
          integers.add(nums[right]);
          res.add(integers);

          left++;
          right--;
          // skip same number
          while (left < right && nums[left - 1] == nums[left]) {
            left++;
          }
          while (left < right && nums[right + 1] == nums[right]) {
            right--;
          }
        }

      }
    }

    return res;
  }
}
