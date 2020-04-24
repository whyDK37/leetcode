package leetcode;

import leetcode.pojo.TreeNode;

public class PathSum {

  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }

    boolean leaf = root.left == null && root.right == null;

    int remain = sum - root.val;
    if (remain == 0 && leaf) {
      return true;
    }

    return hasPathSum(root.left, remain) || hasPathSum(root.right, remain);
  }
}
