package leetcode;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode tail = head, headT = head.next;
        tail.next = null;
        while (headT != null) {
            ListNode headTmp = headT;
            headT = headT.next;

            headTmp.next = tail;
            tail = headTmp;
        }

        return tail;
    }

}
