package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DeleteNodeInALinkedListTest {

    @Test
    public void testDeleteNode() {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);


        head.next = two;
        two.next = three;
        three.next = four;

        DeleteNodeInALinkedList.deleteNode(three);
        assertEquals(head.next.next.val, 4);
    }
}