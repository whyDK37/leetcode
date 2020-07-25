package leetcode.tree;

import com.google.common.collect.Lists;
import java.util.List;
import leetcode.pojo.Node;
import org.testng.annotations.Test;

public class NAryTreeLevelOrderTraversalTest {

  @Test
  public void testLevelOrder() {
    Node node5 = new Node(5);
    Node node6 = new Node(6);
    Node node3 = new Node(3, Lists.newArrayList(node5, node6));
    Node node2 = new Node(2);
    Node node4 = new Node(4);
    Node node1 = new Node(1, Lists.newArrayList(node3, node2, node4));

    NAryTreeLevelOrderTraversal nAryTreeLevelOrderTraversal = new NAryTreeLevelOrderTraversal();
    List<List<Integer>> lists = nAryTreeLevelOrderTraversal.levelOrder(node1);
    System.out.println(lists);


  }
}