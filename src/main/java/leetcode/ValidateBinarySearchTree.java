package leetcode;

import leetcode.pojo.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;

        if (root.left != null && root.left.val >= root.val) return false;
        if (root.left != null && min != null && (root.left.val <= min))
            return false;
        if (root.right != null && root.right.val <= root.val) return false;
        if (root.right != null && max != null && (root.right.val >= max))
            return false;

        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}
