package leetcode;


import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {

  public ListNode mergeKLists(ListNode[] lists) {
    ListNode dump = new ListNode(0);
    ListNode curr = dump;

    PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(
        Comparator.comparingInt(o -> o.val));

    for (ListNode list : lists) {
      ListNode tmp = list;
      while (tmp != null) {
        ListNode tmpQ = tmp;
        tmp = tmp.next;
        tmpQ.next = null;
        priorityQueue.add(tmpQ);
      }
    }

    while (!priorityQueue.isEmpty()) {
      curr.next = priorityQueue.poll();
      curr = curr.next;
    }
    return dump.next;
  }
}
