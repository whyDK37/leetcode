package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(121));
        assertFalse(palindromeNumber.isPalindrome(10));
        assertFalse(palindromeNumber.isPalindrome(-121));
    }
}