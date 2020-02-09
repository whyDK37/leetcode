package leetcode.tree;

import leetcode.pojo.TreeNode;
import leetcode.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LowestCommonAncestorOfABinarySearchTreeTest {

    @Test
    public void testLowestCommonAncestor() {
        LowestCommonAncestorOfABinarySearchTree tree = new LowestCommonAncestorOfABinarySearchTree();
        TreeNode root = TestUtil.buildTree(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        Assert.assertEquals(tree.lowestCommonAncestor(root, root.left, root.right).val, 6);


        root = TestUtil.buildTree(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        Assert.assertEquals(tree.lowestCommonAncestor(root, root.left, root.left.right).val, 2);
    }
}