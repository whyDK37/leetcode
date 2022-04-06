package leetcode.tree.traversal;

import java.util.ArrayList;
import java.util.List;
import leetcode.pojo.TreeNode;

/**
 * 144 https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class BinaryTreePreorderTraversal2 {

  public List<Integer> preorderTraversal(TreeNode root) {
    // 结果
    List<Integer> result = new ArrayList<>();
    preOrder(result, root);
    return result;
  }

  private void preOrder(List<Integer> result, TreeNode root) {
    if (root == null) {
      return;
    }

    result.add(root.val);
    if (root.left != null) {
      preOrder(result, root.left);
    }
    if (root.right != null) {
      preOrder(result, root.right);
    }

  }
}
