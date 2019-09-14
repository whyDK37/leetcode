package leetcode.tree;

import leetcode.pojo.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 前序遍历
 * 首先遍历根节点，然后遍历左子树，最后遍历右子树。
 * <p>
 * 中序遍历
 * 首先访问左子树，然后访问根节点，最后访问右子树。
 * <p>
 * 后序遍历
 * 首先访问左子树，然后访问右子树，最后访问根节点。
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return Collections.EMPTY_LIST;

        List<Integer> result = new ArrayList<>();
        inOrder(result, root);

        return result;
    }

    private void inOrder(List<Integer> result, TreeNode root) {
        if (root == null) return;

        if (root.left != null) {
            inOrder(result, root.left);
        }
        result.add(root.val);
        if (root.right != null) {
            inOrder(result, root.right);
        }
    }
}
