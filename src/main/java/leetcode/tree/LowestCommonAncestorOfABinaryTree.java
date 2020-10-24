package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * <p>
 * 光头哥 https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/discuss/65225/4-lines-C%2B%2BJavaPythonRuby
 */
public class LowestCommonAncestorOfABinaryTree {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    // 终止条件
    if (root == null || root == p || root == q) {
      return root;
    }
    // 当前逻辑

    // 下探到下一层
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    return left == null ? right : right == null ? left : root;
  }
}
