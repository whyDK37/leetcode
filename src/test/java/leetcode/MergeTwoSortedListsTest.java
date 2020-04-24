package leetcode;

import leetcode.util.ListNodeUtil;
import org.testng.annotations.Test;

public class MergeTwoSortedListsTest {

  @Test
  public void testMergeTwoLists() {
    ListNode l1 = ListNodeUtil.createListNode(1, 2, 4);
    ListNode l2 = ListNodeUtil.createListNode(1, 3, 4);

    ListNode listNode = MergeTwoSortedLists.mergeTwoLists(l1, l2);
    ListNodeUtil.equalsListNode(listNode, new int[]{1, 1, 2, 3, 4, 4});

  }
}