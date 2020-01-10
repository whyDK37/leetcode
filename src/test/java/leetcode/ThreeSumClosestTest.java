package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThreeSumClosestTest {

    @Test
    public void testThreeSumClosest() {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        Assert.assertEquals(threeSumClosest.threeSumClosest(new int[]{0, 2, 1, -3}, 1), 0);
        Assert.assertEquals(threeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1), 2);

    }
}