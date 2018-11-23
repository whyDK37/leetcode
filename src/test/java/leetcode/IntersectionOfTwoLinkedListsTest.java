package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void testGetIntersectionNode() {
        ListNode headA = new ListNode(11);
        ListNode head12 = new ListNode(12);
        ListNode head13 = new ListNode(13);
        headA.next = head12;
        head12.next = head13;

        ListNode headB = new ListNode(21);
        ListNode head22 = new ListNode(22);
        ListNode head23 = new ListNode(23);
        headB.next = head22;
        head22.next = head23;

        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node3.next = node4;
        node4.next = node5;

        // comment node
        head13.next = node3;
        head23.next = node3;

        ListNode node = IntersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);
        assertEquals(node.val, 3);
    }
}