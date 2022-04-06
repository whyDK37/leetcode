package leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import leetcode.pojo.TreeNode;

/**
 * 114 https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 */
public class FlattenBinaryTreeToLinkedList {

  public void flatten(TreeNode root) {
    if (root == null) {
      return;
    }

    List<TreeNode> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode pop = stack.pop();
      result.add(pop);
      if (pop.right != null) {
        stack.push(pop.right);
      }
      if (pop.left != null) {
        stack.push(pop.left);
      }
    }


    for (int i = 1; i < result.size(); i++) {
      TreeNode prev = result.get(i - 1), curr = result.get(i);
      prev.left = null;
      prev.right = curr;
    }

  }
}
