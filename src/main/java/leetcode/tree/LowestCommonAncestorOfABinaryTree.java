package leetcode.tree;

import leetcode.pojo.TreeNode;

public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) return root;

        TreeNode left = root == p ? root : lowestCommonAncestor(root.left, p, q);
        TreeNode right = root == q ? root : lowestCommonAncestor(root.right, p, q);

        return left == null ? right : right == null ? left : root;
    }

    public static void main(String[] args) {
        Object root = 1, left = 1, right = null;
        System.out.println(left == null ? right : right == null ? left : root);
    }
}
