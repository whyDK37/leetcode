package leetcode;

public class ReverseLinkedList2 {

  public static ListNode reverseBetween(ListNode head, int m, int n) {

    if (head == null) {
      return null;
    }
    if (head.next == null) {
      return head;
    }

    ListNode sentinel = new ListNode(0);
    sentinel.next = head;

    ListNode start = sentinel;
    ListNode firstPartEnd = sentinel;
    while (m-- > 0) {
      firstPartEnd = start;
      start = start.next;
      n--;
    }

    ListNode nextStart = start;
    while (n-- > 0) {
      ListNode next = nextStart.next;
      ListNode next2 = next.next;

      ListNode firstNext = firstPartEnd.next;
      firstPartEnd.next = next;
      next.next = firstNext;
      nextStart.next = next2;

    }

    return sentinel.next;
  }

}
