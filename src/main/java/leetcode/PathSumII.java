package leetcode;

import java.util.ArrayList;
import java.util.List;
import leetcode.pojo.TreeNode;

public class PathSumII {

  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(result, new ArrayList<>(), root, sum);
    return result;
  }

  public void dfs(List<List<Integer>> result, List<Integer> current, TreeNode node, int sum) {
    if (node == null) {
      return;
    }

    boolean leaf = node.left == null && node.right == null;

    current.add(node.val);

    int remain = sum - node.val;
    if (remain == 0 && leaf) {
      List<Integer> rs = new ArrayList<>(current);
      result.add(rs);
    }

    dfs(result, current, node.left, remain);
    dfs(result, current, node.right, remain);
    current.remove(current.size() - 1);
  }
}
