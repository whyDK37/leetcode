package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * 543 https://leetcode-cn.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {

  int maxd = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    depth(root);
    return maxd;
  }

  public int depth(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int left = depth(node.left);
    int right = depth(node.right);

    maxd = Math.max(right + left, maxd);//将每个节点最大直径(左子树深度+右子树深度)当前最大值比较并取大者

    return Math.max(left, right) + 1;//返回节点深度，用于上层遍历
  }
}
