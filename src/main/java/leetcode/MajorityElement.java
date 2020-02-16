package leetcode;


import java.util.Arrays;

public class MajorityElement {

  public int majorityElement(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    Arrays.sort(nums);
    int mid = nums.length / 2;
    //if(nums[mid]==nums[mid+1] || nums[mid]==nums[mid-1] )
    return nums[mid];
  }
}
