package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UniquePathsTest {

    @Test
    public void testUniquePaths() {
        UniquePaths uniquePaths = new UniquePaths();
        Assert.assertEquals(uniquePaths.uniquePaths(3, 2), 3);
        Assert.assertEquals(uniquePaths.uniquePaths(7, 3), 28);
    }
}