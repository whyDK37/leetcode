package leetcode.util;

import java.util.ArrayList;
import java.util.List;
import leetcode.ListNode;
import org.testng.Assert;

public class ListNodeUtil {

  public static void equalsListNode(ListNode head, int[] ints) {
    List<Integer> nodeArr = new ArrayList<>();
    while (head != null) {
      nodeArr.add(head.val);
      head = head.next;
    }

    Assert.assertEquals(nodeArr.size(), ints.length);

    Integer[] integers = nodeArr.toArray(new Integer[0]);
    for (int i = 0; i < integers.length; i++) {
      Assert.assertEquals(integers[i].intValue(), ints[i]);
    }
  }


  public static ListNode createListNode(int... arr) {
    ListNode sentinal = new ListNode(0);

    ListNode curr = sentinal;
    for (int i : arr) {
      curr.next = new ListNode(i);
      curr = curr.next;
    }

    return sentinal.next;
  }

  public static void printListNode(ListNode listNode) {
    if (listNode == null) {
      System.out.println("[]");
      return;
    }

    ListNode next = listNode;
    StringBuilder sb = new StringBuilder();
    while (next != null) {
      sb.append(next.val).append("->");
      next = next.next;
    }
    sb.delete(sb.length() - 2, sb.length());
    System.out.println("[" + sb + "]");
  }
}
