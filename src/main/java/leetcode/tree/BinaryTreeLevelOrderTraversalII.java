package leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import leetcode.pojo.TreeNode;

/**
 * bsf
 */
public class BinaryTreeLevelOrderTraversalII {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    if (root == null) {
      return Collections.EMPTY_LIST;
    }

    List<List<Integer>> result = new LinkedList<>();

    List<TreeNode> level1 = new ArrayList<>();
    List<TreeNode> level2 = new ArrayList<>();
    level1.add(root);
    while (!level1.isEmpty()) {
      result.add(0, new ArrayList<>());
      level2.clear();
      for (TreeNode treeNode : level1) {
        if (treeNode.left != null) {
          level2.add(treeNode.left);
        }
        if (treeNode.right != null) {
          level2.add(treeNode.right);
        }

        result.get(0).add(treeNode.val);
      }

      level1.clear();
      level1.addAll(level2);
    }

    return result;
  }
}
