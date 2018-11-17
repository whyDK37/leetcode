package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LinkedListCycleTest {

    @Test
    public void testHasCycle() {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = head;

        assertTrue(LinkedListCycle.hasCycle(head));
        five.next = two;
        assertTrue(LinkedListCycle.hasCycle(head));
        five.next = three;
        assertTrue(LinkedListCycle.hasCycle(head));
        five.next = four;
        assertTrue(LinkedListCycle.hasCycle(head));
        five.next = five;
        assertTrue(LinkedListCycle.hasCycle(head));

        five.next = null;
        assertFalse(LinkedListCycle.hasCycle(head));
    }
}