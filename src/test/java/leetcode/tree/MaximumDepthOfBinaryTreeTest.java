package leetcode.tree;

import static org.testng.Assert.assertEquals;

import leetcode.pojo.TreeNode;
import leetcode.tree.MaximumDepthOfBinaryTree;
import org.testng.annotations.Test;

public class MaximumDepthOfBinaryTreeTest {

  @Test
  public void testMaxDepth() {
    MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    assertEquals(maximumDepthOfBinaryTree.maxDepth(root), 3);
  }
}