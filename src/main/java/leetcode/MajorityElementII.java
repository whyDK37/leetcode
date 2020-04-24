package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MajorityElementII {

  public List<Integer> majorityElement(int[] nums) {
    if (nums == null || nums.length == 0) {
      return Collections.emptyList();
    }
    if (nums.length == 1) {
      List<Integer> integers = new ArrayList<>(1);
      integers.add(nums[0]);
      return integers;
    }

    Arrays.sort(nums);
    List<Integer> integers = new ArrayList<>();
    int start = 0, end = 0, cur = nums[0];
    int majority = nums.length / 3;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == cur) {
        end = i;
      } else if (nums[i] != cur) {
        ifAdd(integers, start, end, cur, majority);

        start = end = i;
        cur = nums[i];
      }
    }

    ifAdd(integers, start, end, cur, majority);

    return integers;
  }

  private void ifAdd(List<Integer> integers, int start, int end, int cur, int majority) {
    if ((end - start + 1) > majority) {
      integers.add(cur);
    }
  }
}
