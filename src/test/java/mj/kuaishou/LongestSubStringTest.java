package mj.kuaishou;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LongestSubStringTest {

  @Test
  public void testLongest2() {
    assertEquals(1, LongestSubString.longest2(new int[]{2, 2, 2, 2}));
    assertEquals(2, LongestSubString.longest2(new int[]{1, 2, 2, 2}));
    assertEquals(4, LongestSubString.longest2(new int[]{1, 2, 3, 4}));
    assertEquals(4, LongestSubString.longest2(new int[]{2, 2, 3, 4, 3, 2, 1}));
  }
}