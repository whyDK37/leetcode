package leetcode;

import java.util.Arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) return 1;

        Arrays.sort(nums);
        int missing = 1;
        for (int num : nums) {
            if (num > 0) {
                if (num != missing) {
                    if (num != (missing - 1)) {
                        break;
                    }
                } else {
                    missing++;
                }
            }
        }
        return missing;
    }
}
