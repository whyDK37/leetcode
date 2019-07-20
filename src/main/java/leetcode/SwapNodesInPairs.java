package leetcode;


public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode sen = new ListNode(0);
        sen.next = head;
        ListNode cur = sen;
        while (cur.next != null && cur.next.next != null) {
            ListNode next = cur.next;
            ListNode next1 = next.next;
            ListNode next2 = next1.next;

            cur.next = next1;
            next1.next = next;
            next.next = next2;
            cur = cur.next.next;
        }

        return sen.next;
    }
}
