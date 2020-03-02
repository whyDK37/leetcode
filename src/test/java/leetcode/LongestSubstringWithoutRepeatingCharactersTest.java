package leetcode;

import static leetcode.LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring;

import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

  @Test
  public void testLengthOfLongestSubstring() {
    System.out.println(lengthOfLongestSubstring("anviaj") == 5);
    System.out.println(lengthOfLongestSubstring("aab") == 2);
    System.out.println(lengthOfLongestSubstring("abcabcbb") == 3);
    System.out.println(lengthOfLongestSubstring("bbbbb") == 1);
    System.out.println(lengthOfLongestSubstring("pwwkew") == 3);
  }
}