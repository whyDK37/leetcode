package leetcode;

public class ReverseNodesInKGroup2 {

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k <= 1) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode begin = dummy;
        int i = 0;
        while (head != null) {
            i++;
            if (i % k == 0) {
                begin = reverse(begin, head.next);
                head = begin.next;
            } else {
                head = head.next;
            }
        }

        return dummy.next;
    }

    public static ListNode reverse(ListNode beg, ListNode end) {
        ListNode prev = beg;
        ListNode curr = beg.next;
        ListNode first = beg.next;
        ListNode next;
        while (curr != end) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        beg.next = prev;
        first.next = curr;

        return first;
    }

}
