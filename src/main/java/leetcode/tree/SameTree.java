package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * DFS
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameNode(p, q);
    }

    private boolean isSameNode(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        return p.val == q.val && isSameNode(p.left, q.left) && isSameNode(p.right, q.right);
    }
}
