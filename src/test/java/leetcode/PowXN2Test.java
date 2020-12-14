package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PowXN2Test {

  @Test
  public void testMyPow() {
    PowXN2 powxN = new PowXN2();
    System.out.println(0.3 - 0.1);
    assertEquals(powxN.myPow(2.00000, 2), 4.0);
    assertEquals(powxN.myPow(2.00000, -2147483648), 0.0);
    assertEquals(powxN.myPow(2.0, -5), 0.03125);
    assertEquals(powxN.myPow(2.0, 1), 2.0);
    assertEquals(powxN.myPow(2.0, -2), 0.25000);
    assertEquals(powxN.myPow(2.0, 10), 1024.0);
//        Assert.assertEquals(powxN.myPow(2.1, 3), 9.261);
  }
}