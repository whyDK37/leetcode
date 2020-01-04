package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowxNTest {

    @Test
    public void testMyPow() {
        PowxN powxN = new PowxN();
        Assert.assertEquals(powxN.myPow(2.0, 10), 1024.0);
        Assert.assertEquals(powxN.myPow(2.1, 3), 9.26100);
        Assert.assertEquals(powxN.myPow(2.0, -2), 0.25000);
    }
}