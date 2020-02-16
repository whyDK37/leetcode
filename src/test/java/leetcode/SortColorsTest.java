package leetcode;

import leetcode.util.TestUtil;
import org.testng.annotations.Test;

public class SortColorsTest {

  @Test
  public void testSortColors() {
    SortColors sortColors = new SortColors();

    int[] nums = {2, 0, 2, 1, 1, 0};
    sortColors.sortColors(nums);
    TestUtil.equals(nums, new int[]{0, 0, 1, 1, 2, 2});
  }

  @Test
  public void testSort() {
    SortColors sortColors = new SortColors();
    sortColors.sortColors(new int[]{6, 8});
  }
}