package leetcode;


/**
 * Input:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * <p>
 * <p>
 * divide and conquer:
 * <pre>
 * [1->4->5]          [1->3->4]    [2->6]
 *      \                /            |
 *       \              /             |
 *        \            /              |
 *       [1->4->5]-[1->3->4]       [2->6]
 *       [1->1->3->4->5]           [2->6]
 *               \                   /
 *                \                 /
 *                 \               /
 *               [1->1->2->3->4->5->6]
 * </pre>
 */
public class MergeKSortedLists2 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        int mid = left + (right - left) / 2;
        ListNode leftNode = merge(lists, left, mid);
        ListNode rightNode = merge(lists, mid + 1, right);
        return mergeTwoList(leftNode, rightNode);
    }

    private ListNode mergeTwoList(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (left != null && right != null) {
            if (left.val < right.val) {
                p.next = left;
                left = left.next;
            } else {
                p.next = right;
                right = right.next;
            }
            p = p.next;
        }
        if (left != null) {
            p.next = left;
        }
        if (right != null) {
            p.next = right;
        }
        return dummy.next;
    }
}
