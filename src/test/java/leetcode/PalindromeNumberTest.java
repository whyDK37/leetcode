package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PalindromeNumberTest {

  @Test
  public void testIsPalindrome() {
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    assertTrue(palindromeNumber.isPalindrome(121));
    assertFalse(palindromeNumber.isPalindrome(10));
    assertFalse(palindromeNumber.isPalindrome(-121));
  }
}