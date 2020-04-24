package leetcode;

import leetcode.pojo.TreeNode;

public class InvertBinaryTree {

  public TreeNode invertTree(TreeNode root) {

    doInvertTree(root);

    return root;
  }

  private void doInvertTree(TreeNode root) {
    if (root == null) {
      return;
    }
    TreeNode left = root.left;
    TreeNode right = root.right;

    root.right = left;
    root.left = right;

    doInvertTree(left);
    doInvertTree(right);
  }
}
