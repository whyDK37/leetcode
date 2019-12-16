package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null) return head;


        List<ListNode> listNodes = new ArrayList<>();

        ListNode node = head;
        while (node != null) {
            listNodes.add(node);
            node = node.next;
        }

        listNodes.sort(Comparator.comparingInt(o -> o.val));

        ListNode sentinal = new ListNode(0);
        ListNode curr = sentinal;
        for (ListNode listNode : listNodes) {
            curr.next = listNode;
            curr = curr.next;
        }
        curr.next = null;

        return sentinal.next;
    }
}
