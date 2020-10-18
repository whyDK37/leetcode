package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * 226 https://leetcode.com/problems/invert-binary-tree/description/
 */
public class InvertBinaryTree {

  public TreeNode invertTree(TreeNode root) {

    // 递归函数
    doInvertTree(root);

    return root;
  }

  private void doInvertTree(TreeNode root) {
    // terminator
    if (root == null) {
      return;
    }

    // process current logic
    TreeNode tmp = root.left;
    root.left = root.right;
    root.right = tmp;

    // drill down
    doInvertTree(root.left);
    doInvertTree(root.right);

    // restore current status
  }
}
