package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LinkedListCycle2Test {

    @Test
    public void testDetectCycle() {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        assertNull(LinkedListCycle2.detectCycle(head));
        five.next = head;
        assertEquals(LinkedListCycle2.detectCycle(head), head);
        five.next = two;
        assertEquals(LinkedListCycle2.detectCycle(head), two);
        five.next = three;
        assertEquals(LinkedListCycle2.detectCycle(head), three);
        five.next = four;
        assertEquals(LinkedListCycle2.detectCycle(head), four);
        five.next = five;
        assertEquals(LinkedListCycle2.detectCycle(head), five);
    }
}