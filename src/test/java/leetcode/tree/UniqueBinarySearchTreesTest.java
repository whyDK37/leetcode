package leetcode.tree;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniqueBinarySearchTreesTest {

    @Test
    public void testNumTrees() {
        UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();
        Assert.assertEquals(uniqueBinarySearchTrees.numTrees(3), 5);
    }
}