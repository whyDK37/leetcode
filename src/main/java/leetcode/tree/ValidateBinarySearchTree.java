package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 *
 * <pre>
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * 1. The left subtree of a node contains only nodes with keys less than the node's key.
 * 2. The right subtree of a node contains only nodes with keys greater than the node's key.
 * 3. Both the left and right subtrees must also be binary search trees.
 *
 * </pre>
 */
public class ValidateBinarySearchTree {

  public boolean isValidBST(TreeNode root) {
    if (root == null) {
      return true;
    }

    return isValid(root, null, null);
  }

  private boolean isValid(TreeNode root, Integer min, Integer max) {
    // terminator
    if (root == null) {
      return true;
    }
    // process current logic
    if (min != null && root.val <= min) {
      return false;
    }
    if (max != null && root.val >= max) {
      return false;
    }

    // drill down
    return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);

    // restore current status
  }
}
