package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleNumberIITest {

  @Test
  public void testSingleNumber() {
    SingleNumberII singleNumberII = new SingleNumberII();
    Assert.assertEquals(singleNumberII.singleNumber(new int[]{2, 2, 3, 2}), 3);
    Assert.assertEquals(singleNumberII.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}), 99);
  }
}