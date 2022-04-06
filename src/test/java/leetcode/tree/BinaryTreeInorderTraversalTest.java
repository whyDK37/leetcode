package leetcode.tree;

import java.util.List;
import leetcode.pojo.TreeNode;
import leetcode.tree.traversal.BinaryTreeInorderTraversal;
import org.testng.annotations.Test;

public class BinaryTreeInorderTraversalTest {

  @Test
  public void testInorderTraversal() {
    BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

    List<Integer> integers = binaryTreeInorderTraversal.inorderTraversal(new TreeNode(1
        , null, new TreeNode(2
        , new TreeNode(3), null)));
    System.out.println(integers);
  }
}