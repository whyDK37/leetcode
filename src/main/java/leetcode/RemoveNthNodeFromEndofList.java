package leetcode;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        ListNode dump = new ListNode(-1);
        dump.next = head;
        ListNode fast = dump, slow = dump;
        while (n-- > 0) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        // delete slow node;
        return dump.next;
    }
}
