package leetcode;

import org.testng.annotations.Test;

import static leetcode.ListNodeUtil.createListNode;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = createListNode(2, 4, 3);//new ListNode(2).setNext(new ListNode(4).setNext(new ListNode(3)));
        ListNode l2 = createListNode(5, 6, 4);//new ListNode(5).setNext(new ListNode(6).setNext(new ListNode(4)));
        ListNode listNode = AddTwoNumbers.addTwoNumbers(l1, l2);

        ListNodeUtil.printListNode(listNode);
    }
}