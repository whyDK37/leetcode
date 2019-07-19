package leetcode;


public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode sen = new ListNode(0);
        sen.next = head;
        ListNode cur = sen;
        while (cur.next != null && cur.next.next != null) {
            ListNode next = cur.next;
            ListNode next1 = cur.next.next;

            cur = cur.next.next;
        }


        return sen.next;
    }
}
