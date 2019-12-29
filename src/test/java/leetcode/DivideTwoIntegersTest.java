package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivideTwoIntegersTest {

    @Test
    public void testDivide() {
        DivideTwoIntegers divide = new DivideTwoIntegers();
        Assert.assertEquals(divide.divide(10, 3), 3);
        Assert.assertEquals(divide.divide(7, -3), -2);
    }

    public static void main(String[] args) {
        System.out.println(-7 / -3);
    }
}