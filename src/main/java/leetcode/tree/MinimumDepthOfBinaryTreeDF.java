package leetcode.tree;

import java.util.LinkedList;
import leetcode.pojo.TreeNode;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * <p>
 * 广度优先算法
 */
public class MinimumDepthOfBinaryTreeDF {

  public int minDepth(TreeNode root) {
    // terminator  终止条件
    if (root == null) {
      // process result
      return 0;
    }

    int depth = 0;
    LinkedList<TreeNode> stack = new LinkedList<>();
    stack.add(root);
    while (!stack.isEmpty()) {
      int nodeNum = stack.size();
      depth++;
      for (int i = 0; i < nodeNum; i++) {
        TreeNode node = stack.pollLast();
        if (node.left == null && node.right == null) {
          stack.clear();
          break;
        }
        if (node.left != null) {
          stack.push(node.left);
        }
        if (node.right != null) {
          stack.push(node.right);
        }

      }

    }

    return depth;
  }
}
