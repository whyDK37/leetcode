package leetcode.tree;

import leetcode.util.TestUtil;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MinimumDepthOfBinaryTreeTest {

    @Test
    public void minDepth() {
        MinimumDepthOfBinaryTree tree = new MinimumDepthOfBinaryTree();

        assertEquals(tree.minDepth(TestUtil.buildTree(new Integer[]{})), 0);
        assertEquals(tree.minDepth(TestUtil.buildTree(new Integer[]{1, null, 2})), 2);
        assertEquals(tree.minDepth(TestUtil.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7})), 2);

    }

}