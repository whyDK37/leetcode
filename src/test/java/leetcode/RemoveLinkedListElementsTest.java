package leetcode;

import leetcode.util.ListNodeUtil;
import org.testng.annotations.Test;

public class RemoveLinkedListElementsTest {

  @Test
  public void testRemoveElements() {
    ListNode head = new ListNode(1,
        new ListNode(2,
            new ListNode(6,
                new ListNode(3,
                    new ListNode(4,
                        new ListNode(5,
                            new ListNode(6)))))));
    ListNodeUtil.equalsListNode(head, new int[]{1, 2, 6, 3, 4, 5, 6});
    ListNode listNode = RemoveLinkedListElements.removeElements(head, 6);
    ListNodeUtil.equalsListNode(listNode, new int[]{1, 2, 3, 4, 5});
  }
}