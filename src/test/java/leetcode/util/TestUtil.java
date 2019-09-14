package leetcode.util;

import leetcode.pojo.TreeNode;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestUtil {

    public static void equals(int[] source, int[] target) {
        Assert.assertEquals(source.length, target.length);

        for (int i = 0; i < source.length; i++) {
            Assert.assertEquals(source[i], target[i]);
        }
    }

    public static TreeNode buildTree(Integer[] tree) {
        if (tree == null || tree.length == 0) return null;

        List<Integer> treeArray = Arrays.asList(tree);
        Iterator<Integer> it = treeArray.iterator();

        TreeNode root = new TreeNode(it.next());
        List<TreeNode> nextRoots = new ArrayList<>();
        List<TreeNode> nextRootTmp = new ArrayList<>();
        nextRootTmp.add(root);
        while (!nextRootTmp.isEmpty() && it.hasNext()) {
            nextRoots.clear();
            nextRoots.addAll(nextRootTmp);
            nextRootTmp = new ArrayList<>();

            for (TreeNode nextRoot : nextRoots) {
                if (nextRoot == null) {
                    it.next();
                    it.next();
                    continue;
                }
                if (it.hasNext()) {
                    Integer next = it.next();
                    nextRoot.left = next == null ? null : new TreeNode(next);
                    nextRootTmp.add(nextRoot.left);
                }
                if (it.hasNext()) {
                    Integer next = it.next();
                    nextRoot.right = next == null ? null : new TreeNode(next);
                    nextRootTmp.add(nextRoot.right);
                }
            }
        }

        return root;
    }

    public static void main(String[] args) {
        System.out.println(buildTree(new Integer[]{1, 2, 2, null, 3, null, 3}));
        System.out.println(buildTree(new Integer[]{1, 2, 2, 3, 4, 4, 3}));
    }
}
