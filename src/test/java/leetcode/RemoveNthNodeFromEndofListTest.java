package leetcode;

import static leetcode.util.ListNodeUtil.createListNode;

import leetcode.util.ListNodeUtil;
import org.testng.annotations.Test;

public class RemoveNthNodeFromEndofListTest {

  @Test
  public void testRemoveNthFromEnd() {
    ListNode listNode = new RemoveNthNodeFromEndofList()
        .removeNthFromEnd(createListNode(1, 2, 3, 4, 5), 2);
    ListNodeUtil.printListNode(listNode);
    ListNodeUtil.equalsListNode(listNode, new int[]{1, 2, 3, 5});
  }
}