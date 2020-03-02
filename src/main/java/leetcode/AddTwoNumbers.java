package leetcode;


public class AddTwoNumbers {

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode sentinel = new ListNode(0), top = sentinel;
    int carry = 0;
    while (l1 != null || l2 != null) {
      int v1 = l1 == null ? 0 : l1.val, v2 = l2 == null ? 0 : l2.val;
      int sum = v1 + v2 + carry;
      carry = sum / 10;
      top.next = new ListNode(sum % 10);
      top = top.next;
      l1 = l1 == null ? null : l1.next;
      l2 = l2 == null ? null : l2.next;
    }
    if (carry != 0) {
      top.next = new ListNode(carry);
    }
    return sentinel.next;
  }
}
