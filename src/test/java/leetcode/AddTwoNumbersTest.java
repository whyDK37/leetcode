package leetcode;

import static leetcode.util.ListNodeUtil.createListNode;

import leetcode.util.ListNodeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.testng.annotations.Test;

public class AddTwoNumbersTest {

  Logger logger = LoggerFactory.getLogger(AddTwoNumbersTest.class);

  @Test
  public void testAddTwoNumbers() {
    ListNode l1 = createListNode(2, 4,
        3);//new ListNode(2).setNext(new ListNode(4).setNext(new ListNode(3)));
    ListNode l2 = createListNode(5, 6,
        4);//new ListNode(5).setNext(new ListNode(6).setNext(new ListNode(4)));
    ListNode listNode = AddTwoNumbers.addTwoNumbers(l1, l2);

    System.out.println("tid:" + MDC.get("tid"));
    ListNodeUtil.printListNode(listNode);
  }
}