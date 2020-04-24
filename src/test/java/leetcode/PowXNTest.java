package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowXNTest {

  @Test
  public void testMyPow() {
    PowXN powxN = new PowXN();
    System.out.println(0.3 - 0.1);
    Assert.assertEquals(powxN.myPow(2.00000, 2), 4.0);
    Assert.assertEquals(powxN.myPow(2.00000, -2147483648), 0.0);
    Assert.assertEquals(powxN.myPow(2.0, -5), 0.03125);
    Assert.assertEquals(powxN.myPow(2.0, 1), 2.0);
    Assert.assertEquals(powxN.myPow(2.0, -2), 0.25000);
    Assert.assertEquals(powxN.myPow(2.0, 10), 1024.0);
//        Assert.assertEquals(powxN.myPow(2.1, 3), 9.261);
  }
}