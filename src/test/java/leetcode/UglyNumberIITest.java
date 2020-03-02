package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class UglyNumberIITest {

  @Test
  public void testNthUglyNumber() {
    assertEquals(new UglyNumberII().nthUglyNumber(1), 1);
    assertEquals(new UglyNumberII().nthUglyNumber(11), 15);
    assertEquals(new UglyNumberII().nthUglyNumber(10), 12);

  }
}