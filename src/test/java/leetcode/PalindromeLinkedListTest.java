package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PalindromeLinkedListTest {

  @Test
  public void testIsPalindrome() {
    assertTrue(new PalindromeLinkedList()
        .isPalindrome(
            new ListNode(1
                , new ListNode(2,
                new ListNode(3,
                    new ListNode(2,
                        new ListNode(1)))))));

    assertTrue(new PalindromeLinkedList()
        .isPalindrome(
            new ListNode(1
                , new ListNode(2,
                new ListNode(2,
                    new ListNode(1))))));

    assertFalse(new PalindromeLinkedList()
        .isPalindrome(
            new ListNode(1
                , new ListNode(2))));
  }
}