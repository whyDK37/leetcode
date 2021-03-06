package leetcode;

import static leetcode.util.ListNodeUtil.createListNode;
import static leetcode.util.ListNodeUtil.equalsListNode;

import org.testng.annotations.Test;

public class MergeKSortedLists2Test {

  @Test
  public void testMergeKLists() {
    ListNode listNode = new MergeKSortedLists2().mergeKLists(new ListNode[]{createListNode(1, 4, 5),
        createListNode(1, 3, 4),
        createListNode(2, 6)});
    equalsListNode(listNode, new int[]{1, 1, 2, 3, 4, 4, 5, 6});
  }
}