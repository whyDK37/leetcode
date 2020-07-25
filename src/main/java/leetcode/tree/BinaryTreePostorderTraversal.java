package leetcode.tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import leetcode.pojo.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class BinaryTreePostorderTraversal {

  public List<Integer> postorderTraversal(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    LinkedList<TreeNode> stack = new LinkedList<>();
    LinkedList<Integer> output = new LinkedList<>();

    stack.add(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.removeLast();
      output.addFirst(node.val);
      if (node.left != null) {
        stack.add(node.left);
      }
      if (node.right != null) {
        stack.add(node.right);
      }
    }
    return output;
  }

}
