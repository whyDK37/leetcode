package leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import leetcode.pojo.Node;

/**
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 * <p>
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 */
public class NAryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrder(Node root) {
    if (root == null) {
      return Collections.emptyList();
    }

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Node> stack = new LinkedList<>();
    stack.add(root);

    while (!stack.isEmpty()) {
      List<Integer> level = new ArrayList<>();
      int length = stack.size();
      for (int i = 0; i < length; i++) {
        Node node = stack.pollFirst();
        level.add(node.val);
        if (node.children != null && !node.children.isEmpty()) {
          stack.addAll(node.children);
        }
      }
      result.add(level);
    }

    return result;
  }
}
