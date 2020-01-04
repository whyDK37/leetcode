package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusOneTest {

    @Test
    public void testPlusOne() {
        PlusOne plusOne = new PlusOne();
        Assert.assertEquals(plusOne.plusOne(new int[]{1, 2, 3}), new int[]{1, 2, 4});
        Assert.assertEquals(plusOne.plusOne(new int[]{9}), new int[]{1, 0});
        Assert.assertEquals(plusOne.plusOne(new int[]{4, 3, 2, 1}), new int[]{4, 3, 2, 2});
    }
}