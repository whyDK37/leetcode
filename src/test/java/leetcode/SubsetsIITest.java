package leetcode;

import org.testng.annotations.Test;

public class SubsetsIITest {

  @Test
  public void testSubsetsWithDup() {
    SubsetsII subsetsII = new SubsetsII();

    System.out.println(subsetsII.subsetsWithDup(new int[]{1, 4, 3, 5, 4, 4, 7, 7, 8, 0}));
//        System.out.println(subsetsII.subsetsWithDup(new int[]{4, 4, 4, 1, 4}));
//        System.out.println(subsetsII.subsetsWithDup(new int[]{1, 2, 2}));

  }
}