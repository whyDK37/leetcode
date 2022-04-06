package leetcode.tree;

import leetcode.tree.traversal.BinaryTreeLevelOrderTraversalII;
import leetcode.util.TestUtil;
import org.testng.annotations.Test;

public class BinaryTreeLevelOrderTraversalIITest {

  @Test
  public void testLevelOrderBottom() {
    BinaryTreeLevelOrderTraversalII treeLevelOrderTraversalII = new BinaryTreeLevelOrderTraversalII();
    treeLevelOrderTraversalII.levelOrderBottom(
        TestUtil.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7}));
  }
}