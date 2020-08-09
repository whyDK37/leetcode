package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * https://leetcode.com/problems/invert-binary-tree/description/
 */
public class InvertBinaryTree {

  public TreeNode invertTree(TreeNode root) {

    doInvertTree(root);

    return root;
  }

  private void doInvertTree(TreeNode root) {
    // terminator
    if (root == null) {
      return;
    }
    // process current logic
    TreeNode left = root.left;
    root.left = root.right;
    root.right = left;

    // drill down
    doInvertTree(root.left);
    doInvertTree(root.right);

    // restore current status
  }
}
