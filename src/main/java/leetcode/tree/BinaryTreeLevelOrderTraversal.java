package leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import leetcode.pojo.TreeNode;

/**
 * 102 https://leetcode-cn.com/problems/binary-tree-level-order-traversal/#/description 解法： 1. BFS
 * 2. DFS 记录遍历的层，把元素加到
 */
public class BinaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    List<List<Integer>> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      ArrayList<Integer> list = new ArrayList<>();
      result.add(list);

      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode currentNode = queue.poll();
        list.add(currentNode.val);
        if (currentNode.left != null) {
          queue.offer(currentNode.left);
        }
        if (currentNode.right != null) {
          queue.offer(currentNode.right);
        }
      }
    }

    return result;
  }
}
