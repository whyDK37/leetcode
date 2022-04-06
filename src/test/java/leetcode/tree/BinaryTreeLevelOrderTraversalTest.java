package leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import leetcode.tree.traversal.BinaryTreeLevelOrderTraversal;
import leetcode.tree.traversal.BinaryTreeLevelOrderTraversalDFS;
import leetcode.util.TestUtil;
import org.testng.annotations.Test;

public class BinaryTreeLevelOrderTraversalTest {

  @Test
  public void testLevelOrderBottom() {
    BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
    List<List<Integer>> lists = traversal
        .levelOrder(TestUtil.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7}));
    System.out.println(lists);
  }


  @Test
  public void testLevelOrderDFS() {
    BinaryTreeLevelOrderTraversalDFS traversal = new BinaryTreeLevelOrderTraversalDFS();
    List<List<Integer>> lists = traversal
        .levelOrder(TestUtil.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7}));
    System.out.println(lists);
  }

  @Test
  public void testList() {
    List<Integer> list = new ArrayList<>();
    list.add(1, 2);
    System.out.println(list);
  }
}