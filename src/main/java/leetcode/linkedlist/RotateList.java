package leetcode.linkedlist;

import leetcode.ListNode;

/**
 * 61. Rotate List https://leetcode.com/problems/rotate-list/
 *
 * @author why
 */
public class RotateList {

  public ListNode rotateRight(ListNode head, int k) {
    if (k == 0 || head == null || head.next == null) {
      return head;
    }

    // 获取链表长度 length
    int length = 1;
    ListNode end = head;
    while (end.next != null) {
      end = end.next;
      length++;
    }

    // 计算移动的 node 个数
    int add = length - k % length;
    if (add == length) {
      return head;
    }

    // 组成环形链表
    end.next = head;
    // end 跳过 add 个节点，这一步修改的 end 节点的位置
    while (add-- > 0) {
      end = end.next;
    }

    // 因为是环形链表，所以跳过 add 后，end.next 就是新的头节点，也就是返回值
    // end节点需要与下一个节点断开。
    ListNode result = end.next;
    end.next = null;
    return result;
  }
}
