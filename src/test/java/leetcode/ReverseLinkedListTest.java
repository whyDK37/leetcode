package leetcode;

import org.testng.annotations.Test;
import util.ListNodeUtil;

public class ReverseLinkedListTest {

    @Test
    public void testReverseList() {
        ListNode head = ListNodeUtil.createListNode(1, 2, 3, 4, 5);

        ListNode listNode = ReverseLinkedList.reverseList(head);
        ListNodeUtil.equalsListNode(listNode, new int[]{5, 4, 3, 2, 1});

    }
}