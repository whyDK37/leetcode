package leetcode;

import static leetcode.LongestPalindromicSubstring.calcP;
import static leetcode.LongestPalindromicSubstring.longestPalindrome;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LongestPalindromicSubstringTest {

  @Test
  public void testLongestPalindrome() {
    assertEquals(longestPalindrome("cbbd"), "bb");
    assertEquals(longestPalindrome("babad"), "bab");
    assertEquals(longestPalindrome("aaaaa"), "aaaaa");
  }

  @Test
  public void calcPTest() {
    assertEquals(calcP("#a#b".toCharArray(), 2), 0);
    assertEquals(calcP("#a#b".toCharArray(), 1), 1);
    assertEquals(calcP("#a#b".toCharArray(), 0), 0);
    assertEquals(calcP("#a#b".toCharArray(), 3), 0);
  }
}