package leetcode.tree;

import leetcode.pojo.TreeNode;
import leetcode.tree.InvertBinaryTree;
import leetcode.util.TestUtil;
import org.testng.annotations.Test;

public class InvertBinaryTreeTest {

  @Test
  public void testInvertTree() {
    InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
    TreeNode treeNode = invertBinaryTree
        .invertTree(TestUtil.buildTree(new Integer[]{4, 2, 7, 1, 3, 6, 9}));
  }
}