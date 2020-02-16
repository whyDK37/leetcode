package leetcode;

public class ReverseNodesInKGroup {

  public static ListNode reverseKGroup(ListNode head, int k) {
    if (head == null) {
      return null;
    }
    if (k == 1) {
      return head;
    }

    int n = k;
    ListNode head1 = head;
    while (n-- > 0 && head1.next != null) {
      head1 = head1.next;
    }
    if (n > 0) {
      return head;
    }

    ListNode sentinal = new ListNode(0);
    sentinal.next = head1;

    // revert part
    ListNode end1 = head;
    head1 = head;
    ListNode preHead = sentinal;
    while (true) {
      n = k;
      while (--n > 0 && end1.next != null) {
        end1 = end1.next;
      }
      if (n > 0) {
        break;
      }

      ListNode nextHead = end1.next;
      end1.next = null;
      preHead.next = reverseList(head1);
      preHead = head1;
      head1.next = nextHead;
      head1 = nextHead;
      end1 = nextHead;
      if (end1 == null) {
        break;
      }
    }

    return sentinal.next;
  }

  public static ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    if (head.next == null) {
      return head;
    }

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
