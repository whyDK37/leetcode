package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveDuplicatesFromSortedArrayTest {

  @Test
  public void testRemoveDuplicates() {
    RemoveDuplicatesFromSortedArray array = new RemoveDuplicatesFromSortedArray();
    Assert.assertEquals(array.removeDuplicates(new int[]{1, 1, 2}), 2);
    Assert.assertEquals(array.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}), 5);
  }
}