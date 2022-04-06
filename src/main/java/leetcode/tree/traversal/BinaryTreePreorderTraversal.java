package leetcode.tree.traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import leetcode.pojo.TreeNode;

/**
 * 144 https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class BinaryTreePreorderTraversal {

  public List<Integer> preorderTraversal(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    // 结果
    List<Integer> result = new ArrayList<>();
    // 模拟栈
    Stack<TreeNode> stack = new Stack<>();
    // 首先把 root 压入栈顶
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode pop = stack.pop();
      // 获取前序
      result.add(pop.val);
      // 因为栈是 LFFO , 所以先入栈 right ，再入栈 left
      if (pop.right != null) {
        stack.push(pop.right);
      }
      if (pop.left != null) {
        stack.push(pop.left);
      }
    }
    return result;
  }
}
