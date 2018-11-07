package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void test() {
        assertEquals(new MedianOfTwoSortedArrays.Solution().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 2.0D);
        assertEquals(new MedianOfTwoSortedArrays.Solution().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 2.5D);
    }
}