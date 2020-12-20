package leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import leetcode.pojo.TreeNode;

/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/#/description
 * 解法：
 * 1. BFS
 * 2. DFS 记录遍历的层，把元素加到
 */
public class BinaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    List<List<Integer>> result = new LinkedList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      ArrayList<Integer> cl = new ArrayList<>();
      result.add(cl);

      int levelCount = queue.size();
      // 处理一层的数据
      for (int i = 0; i < levelCount; i++) {
        TreeNode treeNode = queue.poll();
        cl.add(treeNode.val);
        if (treeNode.left != null) {
          queue.add(treeNode.left);
        }
        if (treeNode.right != null) {
          queue.add(treeNode.right);
        }
      }
    }

    return result;
  }
}
