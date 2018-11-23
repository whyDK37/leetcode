package leetcode;

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode set = new ListNode(-1);
        ListNode setTmp = set;
        while (head != null) {
            if (head.val != val) {
                setTmp.next = head;
                setTmp = setTmp.next;
            }
            head = head.next;
        }
        setTmp.next = null;
        return set.next;
    }

}
