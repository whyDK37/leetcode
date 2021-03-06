package leetcode;

import static leetcode.util.ListNodeUtil.equalsListNode;

import leetcode.util.ListNodeUtil;
import org.testng.annotations.Test;

public class ReverseLinkedList2Test {

  @Test
  public void testReverseBetween() {

    equalsListNode(ReverseLinkedList2.reverseBetween(new ListNode(3,
            new ListNode(5)),
        1, 2),
        new int[]{5, 3});

    ListNode head = new ListNode(1);
    ListNode two = new ListNode(2);
    ListNode three = new ListNode(3);
    ListNode four = new ListNode(4);
    ListNode five = new ListNode(5);

    head.next = two;
    two.next = three;
    three.next = four;
    four.next = five;

    ListNode listNode = ReverseLinkedList2.reverseBetween(head, 2, 4);
    ListNodeUtil.equalsListNode(listNode, new int[]{1, 4, 3, 2, 5});


  }
}