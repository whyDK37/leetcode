package leetcode;

import org.testng.annotations.Test;

public class SubsetsTest {

  @Test
  public void testSubsets() {

    Subsets subsets = new Subsets();

    System.out.println(subsets.subsets(new int[]{1, 2, 3}));
    System.out.println(subsets.subsets(new int[]{1, 2, 2}));
  }

}