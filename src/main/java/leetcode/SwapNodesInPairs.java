package leetcode;


public class SwapNodesInPairs {

  public ListNode swapPairs(ListNode head) {
    ListNode sentinel = new ListNode(0);
    sentinel.next = head;

    ListNode pre = sentinel;
    while (pre.next != null && pre.next.next != null) {
      ListNode a = pre.next, b = a.next;

      pre.next = b;
      a.next = b.next;
      b.next = a;
      pre = a;
    }

    return sentinel.next;
  }
}
