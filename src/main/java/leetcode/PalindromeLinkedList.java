package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    //     Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        if (head.next == null) return true;

        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // key, second part
        ListNode half2 = slow;
        if (fast != null) {
            half2 = slow.next;
        }

        // revers first part
        ListNode cur = head;
        ListNode reverseHead = null;
        ListNode pre = null;
        while (cur != slow) {
            ListNode cn = cur.next;
            pre = reverseHead;
            reverseHead = cur;
            reverseHead.next = pre;

            cur = cn;
        }

        while (half2 != null && reverseHead != null) {
            if (half2.val != reverseHead.val) {
                return false;
            }
            half2 = half2.next;
            reverseHead = reverseHead.next;
        }

        return true;
    }

}
