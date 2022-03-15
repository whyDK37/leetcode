package leetcode.tree;

import java.util.Deque;
import java.util.LinkedList;
import leetcode.pojo.TreeNode;

/**
 * 226 https://leetcode.com/problems/invert-binary-tree/description/ 由于使用应用程序的栈保存调用信息，可能会有栈溢出的风险。
 * 针对这个问题，可以使用代码维护调用栈的方式提高应用程序的健壮性。
 */
public class InvertBinaryTreeWIthStack {

  public TreeNode invertTree(TreeNode root) {

    if (root == null) {
      return root;
    }

    final Deque<TreeNode> stack = new LinkedList<>();
    stack.offer(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      TreeNode tmp = node.left;
      node.left = node.right;
      node.right = tmp;

      if (node.left != null) {
        stack.offer(node.left);
      }
      if (node.right != null) {
        stack.offer(node.right);
      }
    }

    return root;
  }

}
