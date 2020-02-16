package leetcode;

import static leetcode.LongestSubstringWithoutRepeatingCharacters4.lengthOfLongestSubstring;

import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatingCharacters4Test {

  @Test
  public void testLengthOfLongestSubstring() {
    System.out.println(lengthOfLongestSubstring("pwwkew") == 3);
    System.out.println(lengthOfLongestSubstring("abcabcbb") == 3);
    System.out.println(lengthOfLongestSubstring("qrsvbspk") == 5);
    System.out.println(lengthOfLongestSubstring("ynyo") == 3);
    System.out.println(lengthOfLongestSubstring("anviaj") == 5);
    System.out.println(lengthOfLongestSubstring("aab") == 2);
    System.out.println(lengthOfLongestSubstring("bbbbb") == 1);
    System.out.println(lengthOfLongestSubstring("tmmzuxt") == 5);
  }
}