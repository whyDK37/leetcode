package leetcode;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations-ii/
 * <p>
 * 本题和 Permutations 的区别就在递归函数中的 for 循环，如何判跳过的逻辑。
 */
public class PermutationsII {

  public List<List<Integer>> permute(int[] nums) {
    if (nums.length == 0) {
      return Collections.emptyList();
    }
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> stack = new ArrayDeque<>();
    boolean[] used = new boolean[nums.length];
    dfs(nums, 0, stack, used, res);
    return res;
  }

  /**
   * @param nums  数据集合
   * @param depth 深度
   * @param path  路径
   * @param used  使用的数据集合标记
   * @param res   结果
   */
  private void dfs(int[] nums, int depth, Deque<Integer> path, boolean[] used,
      List<List<Integer>> res) {
    // 终止条件
    if (depth == nums.length) {
      res.add(new ArrayList<>(path));
      return;
    }
    for (int i = 0; i < nums.length; i++) {

      // 当前层逻辑
      if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
        continue;
      }

      // 当前层逻辑
      path.addLast(nums[i]);
      used[i] = true;

      // 下探一层
      dfs(nums, depth + 1, path, used, res);

      // 清理当前层数据
      path.removeLast();
      used[i] = false;

    }
  }

}
