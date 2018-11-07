package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            // key: value, value:index
            Map<Integer, Integer> m = new HashMap<>();
            int[] result = null;
            for (int f = 0; f < nums.length; f++) {
                if (!m.containsKey(nums[f])) {
                    m.putIfAbsent(target - nums[f], f);
                } else {
                    result = new int[]{m.get(nums[f]), f};
                    break;
                }
            }

            return result;
        }
    }

}