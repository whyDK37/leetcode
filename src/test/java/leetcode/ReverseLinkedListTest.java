package leetcode;

import leetcode.ReverseLinkedList.ListNode;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

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
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }
}