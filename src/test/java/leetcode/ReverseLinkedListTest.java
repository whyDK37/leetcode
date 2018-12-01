package leetcode;

import org.testng.annotations.Test;

public class ReverseLinkedListTest {

    @Test
    public void testReverseList() {
        ListNode head = ListNodeUtil.createList(new int[]{1, 2, 3, 4, 5});

        ListNode listNode = ReverseLinkedList.reverseList(head);
        ListNodeUtil.equalsNode(listNode, new int[]{5, 4, 3, 2, 1});

    }
}