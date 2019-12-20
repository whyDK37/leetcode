package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HouseRobberTest {

    @Test
    public void testRob() {
        HouseRobber robber = new HouseRobber();
        Assert.assertEquals(robber.rob(new int[]{2, 7, 1, 3, 9}), 12);
//        Assert.assertEquals(robber.rob(new int[]{2, 7, 9, 3, 1}), 12);
//        Assert.assertEquals(robber.rob(new int[]{2, 7, 1, 3, 9}), 16);
//        Assert.assertEquals(robber.rob(new int[]{1, 2, 3, 1}), 4);
    }
}