package leetcode;

import static java.util.Arrays.asList;
import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class ThreeSum2Test {

  @Test
  public void testThreeSum() {
    ThreeSum2 threeSum2 = new ThreeSum2();
    System.out.println(threeSum2.threeSum(new int[]{0, 0, 0, -1, 2, -1, -4}));
    System.out.println(threeSum2.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    System.out.println(threeSum2.threeSum(new int[]{-2, 0, 0, 2, 2}));

    assertEquals(threeSum2.threeSum(new int[]{0, 0, 0, -1, 2, -1, -4}),
        asList(asList(-1, -1, 2), asList(0, 0, 0)));
    assertEquals(threeSum2.threeSum(new int[]{-1, 0, 1, 2, -1, -4}),
        asList(asList(-1, -1, 2), asList(-1, 0, 1)));
    assertEquals(threeSum2.threeSum(new int[]{-2, 0, 0, 2, 2}),
        asList(asList(-2, 0, 2)));
  }
}