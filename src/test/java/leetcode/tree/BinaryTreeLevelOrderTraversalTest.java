package leetcode.tree;

import leetcode.util.TestUtil;
import org.testng.annotations.Test;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void testLevelOrderBottom() {
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        traversal.levelOrder(TestUtil.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7}));
    }
}