package leetcode;

import org.testng.annotations.Test;

public class ThreeSumTest {

  @Test
  public void testThreeSum() {
    ThreeSum threeSum = new ThreeSum();
    System.out.println(threeSum.threeSum(new int[]{0, 0, 0, -1, 2, -1, -4}));
    System.out.println(threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    System.out.println(threeSum.threeSum(new int[]{-2, 0, 0, 2, 2}));
  }

  @Test
  public void testThreeSum2() {
    ThreeSumV2 threeSumV2 = new ThreeSumV2();
    System.out.println(threeSumV2.threeSum(new int[]{0, 0, 0, -1, 2, -1, -4}));
    System.out.println(threeSumV2.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    System.out.println(threeSumV2.threeSum(new int[]{-2, 0, 0, 2, 2}));
  }
}