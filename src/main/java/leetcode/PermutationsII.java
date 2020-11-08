package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations-ii/
 * <p>
 * 本题和 Permutations 的区别就在递归函数中的 for 循环，如何判跳过的逻辑。 首先对nums排序。 然后在for循环判断前一个如果一样并且访问过，则跳过
 */
public class PermutationsII {

  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> perm = new ArrayList<>();
    boolean[] vis = new boolean[nums.length];
    Arrays.sort(nums);
    backtrack(nums, ans, 0, vis, perm);
    return ans;
  }

  public void backtrack(int[] nums, List<List<Integer>> ans, int depth, boolean[] vis,
      List<Integer> perm) {
    if (depth == nums.length) {
      ans.add(new ArrayList<>(perm));
      return;
    }
    for (int i = 0; i < nums.length; ++i) {
      if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
        continue;
      }
      perm.add(nums[i]);
      vis[i] = true;
      backtrack(nums, ans, depth + 1, vis, perm);
      vis[i] = false;
      perm.remove(depth);
    }
  }
}