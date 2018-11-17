package leetcode;


/**
 * 2018-9-8
 */
public class AddTwoNumbers {

  static class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
      if (carry != 0) top.next = new ListNode(carry);
      return sentinel.next;
    }
  }

//  static class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//      val = x;
//    }
//
//    ListNode setNext(ListNode next) {
//      this.next = next;
//      return this;
//    }
//  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode l1 = new ListNode(2).setNext(new ListNode(4).setNext(new ListNode(3)));
    ListNode l2 = new ListNode(5).setNext(new ListNode(6).setNext(new ListNode(4)));
    ListNode listNode = solution.addTwoNumbers(l1, l2);
    ListNode next = listNode;
    while (next != null) {
      System.out.print(next.val + " ");
      next = next.next;
    }
  }
}
