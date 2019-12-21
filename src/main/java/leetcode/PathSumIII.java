package leetcode;

import leetcode.pojo.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathSumFrom(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        int s = pathSumFrom(root.left, sum-root.val) + pathSumFrom(root.right, sum-root.val);
        if(root.val == sum) {
            s++;
        }
        return s;
    }
}
