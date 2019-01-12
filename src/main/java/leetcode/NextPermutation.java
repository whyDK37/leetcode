package leetcode;


public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int right = nums.length;

        int i = -1;
        while (--right > 0) {
            if (nums[right - 1] < nums[right]) {
                i = right - 1;
                break;
            }
        }

        if (i == -1) {
            revert(nums, 0, nums.length - 1);
            return;
        }

        int j = i;
        while (++j < nums.length) {
            if (nums[i] >= nums[j]) {
                break;
            }
        }
        j--;

        switch2(nums, i, j);

        revert(nums, i + 1, nums.length - 1);
    }

    private void switch2(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void revert(int[] nums, int start, int end) {
        while (start < end) {
            switch2(nums, start++, end--);
        }
    }
}
