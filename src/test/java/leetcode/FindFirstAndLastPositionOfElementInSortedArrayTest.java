package leetcode;

import leetcode.util.TestUtil;
import org.testng.annotations.Test;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

  @Test
  public void testSearchRange() {
    FindFirstAndLastPositionOfElementInSortedArray test = new FindFirstAndLastPositionOfElementInSortedArray();

    TestUtil.equals(test.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8), new int[]{3, 4});
    TestUtil.equals(test.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6), new int[]{-1, -1});
  }
}