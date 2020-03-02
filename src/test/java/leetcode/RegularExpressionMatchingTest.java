package leetcode;

import static leetcode.RegularExpressionMatching.isMatch;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class RegularExpressionMatchingTest {

  @Test
  public void testIsMatch() {
    assertFalse(isMatch("aa", "a"));
    assertTrue(isMatch("aa", "a*"));
    assertTrue(isMatch("ab", ".*"));
    assertTrue(isMatch("aab", "c*a*b"));
    assertFalse(isMatch("mississippi", "mis*is*p*."));
  }
}