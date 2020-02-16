package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MinimumWindowSubstringTest {

  @Test
  public void testMinWindow() {
    MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();

    assertEquals(minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"), "BANC");

  }
}