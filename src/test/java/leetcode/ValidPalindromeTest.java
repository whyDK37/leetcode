package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void testIsPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(validPalindrome.isPalindrome("race a car"));
    }
}