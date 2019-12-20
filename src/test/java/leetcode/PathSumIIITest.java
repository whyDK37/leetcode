package leetcode;

import leetcode.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PathSumIIITest {

    @Test
    public void testPathSum() {
        PathSumIII pathSumIII = new PathSumIII();
        Assert.assertEquals(pathSumIII.pathSum(TestUtil.buildTree(new Integer[]{10, 5, -3, 3, 2, 11, 3, -2, 1}), 8), 3);
    }
}