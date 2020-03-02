package leetcode;

import leetcode.pojo.TreeNode;

public class MaximumDepthOfBinaryTree {

  public int maxDepth(TreeNode root) {
    // rec end
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }

}
