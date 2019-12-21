package leetcode;

import leetcode.util.TestUtil;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class PathSumIITest {

    @Test
    public void testPathSum() {
        PathSumII pathSumII = new PathSumII();
        List<List<Integer>> lists = pathSumII.pathSum(
                TestUtil.buildTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1}), 22);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}