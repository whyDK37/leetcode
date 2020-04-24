package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class UglyNumberII2Test {

  @Test
  public void testNthUglyNumber() {
    assertEquals(new UglyNumberII2().nthUglyNumber(1), 1);
    assertEquals(new UglyNumberII2().nthUglyNumber(11), 15);
    assertEquals(new UglyNumberII2().nthUglyNumber(10), 12);
  }
}