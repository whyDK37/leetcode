package leetcode;

public class DeleteNodeInALinkedList {

    public static void deleteNode(ListNode node) {
        if (node == null) return;

        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

}
