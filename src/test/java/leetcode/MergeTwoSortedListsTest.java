package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode listNode = MergeTwoSortedLists.mergeTwoLists(l1, l2);
        assertEquals(listNode.val, 1);
        assertEquals(listNode.next.val, 1);
        assertEquals(listNode.next.next.val, 2);
        assertEquals(listNode.next.next.next.val, 3);
        assertEquals(listNode.next.next.next.next.val, 4);
        assertEquals(listNode.next.next.next.next.next.val, 4);

    }
}