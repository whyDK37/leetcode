package leetcode.tree;

import leetcode.pojo.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || p == null || q == null) {
      return root;
    }
    while (root != null) {
      if (p.val < root.val && root.val > q.val) {
        root = root.left;
      } else if (p.val > root.val && root.val < q.val) {
        root = root.right;
      } else {
        return root;
      }
    }
    return null;
  }
}
