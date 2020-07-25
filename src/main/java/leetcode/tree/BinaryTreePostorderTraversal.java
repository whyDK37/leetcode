package leetcode.tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import leetcode.pojo.TreeNode;

/**
 * https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/
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
      TreeNode last = stack.pollLast();
      // todo 感觉像是头插法，不知道有什么特性
      output.addFirst(last.val);

      // 和递归的顺序相反
      if (last.left != null) {
        stack.push(last.left);
      }
      if (last.right != null) {
        stack.push(last.right);
      }
    }
    return output;
  }

}
