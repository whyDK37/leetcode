package leetcode;

import java.util.List;

/**
 */
public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode(-1);
        ListNode cur = sentinel;
        while (l1 != null || l2 != null) {
            ListNode next = null;
            if (l1 == null) {
                next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                next = l1;
                l1 = l1.next;
            } else if (l1.val <= l2.val) {
                next = l1;
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                next = l2;
                l2 = l2.next;
            }

            cur.next = next;
            cur = next;
        }
        return sentinel.next;
    }

}
