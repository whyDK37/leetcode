package leetcode;


import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();

        // using a map to store value and index mapping
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Set<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexMap.computeIfAbsent(nums[i], integer -> new HashSet<>());
            indexMap.get(nums[i]).add(i);
        }

        //
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int remain = 0 - (nums[i] + nums[j]);
                Set<Integer> indexSet = indexMap.get(remain);
                if (indexSet != null) {
                    int index = -1;
                    for (Integer integer : indexSet) {
                        if (integer != i && integer != j) index = integer;
                    }

                    if (index > j) {
                        List<Integer> row = new ArrayList<>(6);
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[index]);
                        result.add(row);
                    }
                }
            }
        }
        return result;
    }
}
