package leetcode;

import static leetcode.util.ListNodeUtil.createListNode;
import static leetcode.util.ListNodeUtil.equalsListNode;

import org.testng.annotations.Test;

public class SwapNodesInPairsTest {

  @Test
  public void testSwapPairs() {
    SwapNodesInPairs swapNodes = new SwapNodesInPairs();
    equalsListNode(swapNodes.swapPairs(createListNode(1, 2, 3, 4)), new int[]{2, 1, 4, 3});
  }
}