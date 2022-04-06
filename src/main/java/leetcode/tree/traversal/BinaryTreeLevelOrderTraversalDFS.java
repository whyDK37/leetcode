package leetcode.tree.traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import leetcode.pojo.TreeNode;

/**
 * 深度优先遍历
 */
public class BinaryTreeLevelOrderTraversalDFS {

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    List<List<Integer>> result = new ArrayList<>();
    dfs(result, root, 0);
    return result;
  }

  private void dfs(List<List<Integer>> result, TreeNode root, int level) {
    if (root == null) {
      return;
    }

    if (result.size() < (level + 1)) {
      result.add(new ArrayList<>());
    }

    result.get(level).add(root.val);
    dfs(result, root.left, level + 1);
    dfs(result, root.right, level + 1);
  }
}
