package leetcode;

import org.testng.annotations.Test;
import util.TestUtil;

import static org.testng.Assert.*;

public class SortColorsTest {

    @Test
    public void testSortColors() {
        SortColors sortColors = new SortColors();

        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors.sortColors(nums);
        TestUtil.equals(nums, new int[]{0, 0, 1, 1, 2, 2});
    }
}