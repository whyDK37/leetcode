package leetcode;

import org.testng.annotations.Test;

import static leetcode.LongestPalindromicSubstring.longestPalindrome;
import static org.testng.Assert.assertEquals;

public class LongestPalindromicSubstringTest {

    @Test
    public void testLongestPalindrome() {
        assertEquals(longestPalindrome("babad"), "bab");
        assertEquals(longestPalindrome("cbbd"), "bb");
    }
}