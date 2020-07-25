package leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import leetcode.pojo.Node;

/**
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 * <p>
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 */
public class NAryTreePostorderTraversal {

  public List<Integer> postorder(Node root) {
    if (root == null) {
      return Collections.emptyList();
    }

    List<Integer> result = new ArrayList<>();
    Stack<Node> stack = new Stack<>();

    innerPostOrder(result, root);

    return result;
  }

  private void innerPostOrder(List<Integer> result, Node root) {
    if (root == null) {
      return;
    }
    if (root.children != null && !root.children.isEmpty()) {
      for (Node child : root.children) {
        innerPostOrder(result, child);
      }
    }
    result.add(root.val);
  }
}
