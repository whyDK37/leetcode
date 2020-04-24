package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ReverseIntegerTest {

  @Test
  public void test() {
    // 2147483647
    System.out.println(Integer.MAX_VALUE);
    System.out.println(846384741);
    assertEquals(new ReverseInteger.Solution().reverse(Integer.MAX_VALUE), 0);
    assertEquals(new ReverseInteger.Solution().reverse(12), 21);
    assertEquals(new ReverseInteger.Solution().reverse(120), 21);
    assertEquals(new ReverseInteger.Solution().reverse(-120), -21);
  }

}