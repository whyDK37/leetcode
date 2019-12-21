package leetcode;

import leetcode.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PathSumTest {

    @Test
    public void testHasPathSum() {
        PathSum pathSum = new PathSum();
        Assert.assertTrue(pathSum.hasPathSum(
                TestUtil.buildTree(new Integer[]{-2, null, -3}),
                -5));
        Assert.assertFalse(pathSum.hasPathSum(
                TestUtil.buildTree(new Integer[]{1, 2}),
                1));
        Assert.assertTrue(pathSum.hasPathSum(
                TestUtil.buildTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1}),
                22));
        Assert.assertFalse(pathSum.hasPathSum(
                TestUtil.buildTree(new Integer[]{1}),
                2));
    }
}