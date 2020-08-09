package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthOfBinaryTree {

  public int maxDepth(TreeNode root) {
    // terminator  终止条件
    if (root == null) {
      // process result
      return 0;
    }

    // process current logic 当前逻辑

    // drill down  下探到下一层
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    // restore current status  清理当前层

  }

}
