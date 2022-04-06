package leetcode.tree;

import java.util.List;
import leetcode.pojo.TreeNode;
import leetcode.tree.traversal.BinaryTreePostorderTraversal;
import org.testng.annotations.Test;

public class BinaryTreePostorderTraversalTest {

  @Test
  public void testPostorderTraversal() {
    BinaryTreePostorderTraversal binaryTreeInorderTraversal = new BinaryTreePostorderTraversal();

    List<Integer> integers = binaryTreeInorderTraversal.postorderTraversal(new TreeNode(1
        , null, new TreeNode(2
        , new TreeNode(3), null)));
    System.out.println(integers);
  }
}