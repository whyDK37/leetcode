package leetcode.tree;

import static org.testng.Assert.*;

import java.util.List;
import leetcode.pojo.TreeNode;
import org.testng.annotations.Test;

public class BinaryTreePreorderTraversalTest {

  @Test
  public void testPreorderTraversal() {
    BinaryTreePreorderTraversal binaryTreeInorderTraversal = new BinaryTreePreorderTraversal();

    List<Integer> integers = binaryTreeInorderTraversal.preorderTraversal(new TreeNode(1
        , null, new TreeNode(2
        , new TreeNode(3), null)));
    System.out.println(integers);
  }
}