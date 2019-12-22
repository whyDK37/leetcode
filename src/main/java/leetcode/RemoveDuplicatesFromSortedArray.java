package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[slow] != nums[i]) {
                nums[++slow] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return slow + 1;
    }
}
