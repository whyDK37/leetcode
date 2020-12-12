package leetcode;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/
 * <p>
 * https://leetcode-cn.com/problems/permutations/solution/quan-pai-lie-by-leetcode-solution-2/
 */
public class Permutations {

  /**
   * return permute(nums, 0);
   *
   * @param nums
   * @param start
   * @return
   * @deprecated
   */
  @Deprecated
  public List<List<Integer>> permute(int[] nums, int start) {
    if (start == nums.length - 1) {
      return Collections.singletonList(Collections.singletonList(nums[start]));
    }

    List<List<Integer>> ret = new ArrayList<>();

    for (List<Integer> cur : permute(nums, start + 1)) {
      for (int i = 0; i <= cur.size(); ++i) {
        List<Integer> l = new ArrayList<>(cur);
        l.add(i, nums[start]);
        ret.add(l);
      }
    }

    return ret;
  }

  // --------------------------------------------------------------
  // dfs

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
      if (used[i]) {
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
