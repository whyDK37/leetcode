package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinimumDepthOfBinaryTree {

  public int minDepth(TreeNode root) {
    // terminator  终止条件
    if (root == null) {
      // process result
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }

    // process current logic 当前逻辑
    int deep = Integer.MAX_VALUE;
    if (root.left != null) {
      deep = Math.min(minDepth(root.left), deep);
    }
    if (root.right != null) {
      deep = Math.min(minDepth(root.right), deep);
    }

    // drill down  下探到下一层
    return 1 + deep;

    // restore current status  清理当前层
  }
}
