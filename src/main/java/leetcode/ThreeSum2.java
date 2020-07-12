package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum2 {

  public List<List<Integer>> threeSum(int[] nums) {
    if (nums == null || nums.length < 3) {
      return Collections.emptyList();
    }

    List<List<Integer>> result = new ArrayList<>();
    // sort
    Arrays.sort(nums);
    for (int k = 0; k < nums.length - 2; k++) {
      if (k == 0 || (nums[k] != nums[k - 1])) {
        int lo = k + 1, hi = nums.length - 1, sum = -nums[k];
        while (hi > lo) {
          if (nums[lo] + nums[hi] == sum) {
            result.add(Arrays.asList(nums[k], nums[lo], nums[hi]));
            while (hi > lo && nums[lo] == nums[lo + 1]) {
              lo++;
            }
            while (hi > lo && nums[hi] == nums[hi - 1]) {
              hi--;
            }
            lo++;
            hi--;
          } else if (nums[lo] + nums[hi] < sum) {
            lo++;
          } else {
            hi--;
          }
        }
      }
    }
    return result;
  }
}
