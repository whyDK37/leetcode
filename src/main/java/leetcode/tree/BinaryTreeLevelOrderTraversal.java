package leetcode.tree;

import leetcode.pojo.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.EMPTY_LIST;

        List<List<Integer>> result = new LinkedList<>();

        List<TreeNode> level1 = new ArrayList<>();
        List<TreeNode> level2 = new ArrayList<>();
        level1.add(root);
        while (!level1.isEmpty()) {
            ArrayList<Integer> cl = new ArrayList<>();
            result.add(cl);
            level2.clear();
            for (TreeNode treeNode : level1) {
                if (treeNode.left != null) level2.add(treeNode.left);
                if (treeNode.right != null) level2.add(treeNode.right);

                cl.add(treeNode.val);
            }

            level1.clear();
            level1.addAll(level2);
        }


        return result;
    }
}
