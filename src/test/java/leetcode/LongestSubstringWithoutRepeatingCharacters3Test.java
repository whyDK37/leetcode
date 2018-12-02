package leetcode;

import org.testng.annotations.Test;

import static leetcode.LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring;
import static org.testng.Assert.*;

public class LongestSubstringWithoutRepeatingCharacters3Test {

    @Test
    public void testLengthOfLongestSubstring() {

        System.out.println(lengthOfLongestSubstring("tmmzuxt") == 5);
        System.out.println(lengthOfLongestSubstring("pwwkew") == 3);
        System.out.println(lengthOfLongestSubstring("abcabcbb") == 3);
        System.out.println(lengthOfLongestSubstring("qrsvbspk") == 5);
        System.out.println(lengthOfLongestSubstring("ynyo") == 3);
        System.out.println(lengthOfLongestSubstring("anviaj") == 5);
        System.out.println(lengthOfLongestSubstring("aab") == 2);
        System.out.println(lengthOfLongestSubstring("bbbbb") == 1);

    }
}