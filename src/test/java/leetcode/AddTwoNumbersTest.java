package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = new ListNode(2).setNext(new ListNode(4).setNext(new ListNode(3)));
        ListNode l2 = new ListNode(5).setNext(new ListNode(6).setNext(new ListNode(4)));
        ListNode listNode = AddTwoNumbers.addTwoNumbers(l1, l2);
        ListNode next = listNode;
        while (next != null) {
            System.out.print(next.val + " ");
            next = next.next;
        }
    }
}