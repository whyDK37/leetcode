package leetcode;

import leetcode.util.TestUtil;
import org.testng.annotations.Test;

public class SlidingWindowMaximumV2Test {

    @Test
    public void testMaxSlidingWindow() {
        SlidingWindowMaximumV2 maximum = new SlidingWindowMaximumV2();
        TestUtil.equals(maximum.maxSlidingWindow(new int[]{1, 3, 1, 2, 0, 5}, 3), new int[]{3, 3, 2, 5});
        TestUtil.equals(maximum.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3), new int[]{3, 3, 5, 5, 6, 7});
        TestUtil.equals(maximum.maxSlidingWindow(new int[]{}, 0), new int[]{});
    }
}