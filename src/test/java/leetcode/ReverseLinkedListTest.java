package leetcode;

import org.testng.annotations.Test;

public class ReverseLinkedListTest {

    @Test
    public void testReverseList() {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode listNode = ReverseLinkedList.reverseList(head);
        ListNodeUtil.equals(listNode, new int[]{5, 4, 3, 2, 1});


    }
}