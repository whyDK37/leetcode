package leetcode;

import static leetcode.util.ListNodeUtil.createListNode;
import static leetcode.util.ListNodeUtil.equalsListNode;

import org.testng.annotations.Test;

public class SortListTest {

  @Test
  public void testSortList() {
    SortList sortList = new SortList();

    ListNode listNode = sortList.sortList(createListNode(4, 2, 1, 3));
    equalsListNode(listNode, new int[]{1, 2, 3, 4});
    listNode = sortList.sortList(createListNode(-1, 5, 3, 4, 0));
    equalsListNode(listNode, new int[]{-1, 0, 3, 4, 5});
  }
}