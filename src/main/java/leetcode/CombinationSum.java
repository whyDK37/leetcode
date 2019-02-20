package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumHelper(result, candidates, target, 0, new ArrayList<>());
        return result;
    }

    private void combinationSumHelper(List<List<Integer>> result, int[] candidates, int target, int start, List<Integer> sumList) {
        if (target == 0) {
            result.add(new ArrayList<>(sumList));
        }
        if (target < 0 || target < candidates[start]) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            sumList.add(candidates[i]);
            combinationSumHelper(result, candidates, target - candidates[i], i, sumList);
            sumList.remove(sumList.size() - 1);
        }
    }
}
