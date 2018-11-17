package leetcode;

/**
 * http://javabypatel.blogspot.com/2015/12/detect-loop-in-linked-list.html
 */
public class LinkedListCycle2 {

    public static ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return null;

        ListNode fast = head, slow = head;
        boolean hasCycle = false;
        while (fast != null && fast.next != null &&
                slow != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) return null;

        while (head != null && slow != null) {
            if (head == slow) return slow;
            head = head.next;
            slow = slow.next;
        }

        return null;
    }

}
