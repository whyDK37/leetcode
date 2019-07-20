package leetcode;

import org.testng.annotations.Test;
import util.ListNodeUtil;

import static org.testng.Assert.*;
import static util.ListNodeUtil.createListNode;
import static util.ListNodeUtil.equalsListNode;

public class SwapNodesInPairsTest {

  @Test
  public void testSwapPairs() {
    SwapNodesInPairs swapNodes = new SwapNodesInPairs();
    equalsListNode(swapNodes.swapPairs(createListNode(1, 2, 3, 4)), new int[]{2, 1, 4, 3});
  }
}