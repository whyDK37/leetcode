package leetcode.tree;

import leetcode.pojo.TreeNode;
import leetcode.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LowestCommonAncestorOfABinaryTreeTest {

    @Test
    public void testLowestCommonAncestor() {
        LowestCommonAncestorOfABinaryTree tree = new LowestCommonAncestorOfABinaryTree();
        TreeNode root = TestUtil.buildTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        Assert.assertEquals(tree.lowestCommonAncestor(root, root.left, root.right).val, 3);
        Assert.assertEquals(tree.lowestCommonAncestor(root, root, root.right).val, 3);
        Assert.assertEquals(tree.lowestCommonAncestor(root, root.left.left, root.left.right).val, 5);
        Assert.assertEquals(tree.lowestCommonAncestor(root, root.left.left, root.left.right.left).val, 5);
        Assert.assertEquals(tree.lowestCommonAncestor(root, root.left, root.left.right.left).val, 5);
    }
}