package leetcode;

import leetcode.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PathSumIIITest {

  @Test
  public void testPathSum() {
    PathSumIII pathSumIII = new PathSumIII();
    Assert.assertEquals(pathSumIII.pathSum(
        TestUtil.buildTree(new Integer[]{1, null, 2, null, null, null, 3}),
        3),
        2);

//        Assert.assertEquals(pathSumIII.pathSum(
//                TestUtil.buildTree(new Integer[]{0, 1, 1}),
//                1),
//                4);

//        Assert.assertEquals(pathSumIII.pathSum(
//                TestUtil.buildTree(new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1, null, null}),
//                8),
//                3);
  }
}