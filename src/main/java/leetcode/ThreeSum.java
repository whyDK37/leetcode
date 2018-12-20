package leetcode;


import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3)
            return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int complement = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == complement) {
                    List<Integer> tempList = new ArrayList<>(3);
                    tempList.add(nums[i]);
                    tempList.add(nums[left]);
                    tempList.add(nums[right]);
                    resultList.add(tempList);


                    // skip same element
                    left++;
                    right--;
                    while (left < right && left > 0 && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && right < nums.length - 1 && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < complement)
                    left++;
                else right--;
            }
        }
        return resultList;
    }
}
