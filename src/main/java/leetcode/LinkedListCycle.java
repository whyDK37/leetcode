package leetcode;

public class LinkedListCycle {

    //     Definition for singly-linked list.
//    public static class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;

        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null &&
                slow != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }

        return false;
    }

}
