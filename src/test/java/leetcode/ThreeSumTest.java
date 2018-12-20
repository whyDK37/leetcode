package leetcode;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class ThreeSumTest {

    @Test
    public void testThreeSum() {
        System.out.println(new ThreeSum().threeSum(new int[]{0, 0, 0, -1, 2, -1, -4}));
        System.out.println(new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(new ThreeSum().threeSum(new int[]{-2, 0, 0, 2, 2}));
    }
}