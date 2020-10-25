package leetcode;

import java.util.List;
import org.testng.annotations.Test;

public class CombinationsTest {

  @Test
  public void testCombine() {
    Combinations combinations = new Combinations();
    List<List<Integer>> combine = combinations.combine(4, 2);
    for (List<Integer> integers : combine) {
      System.out.println(integers);
    }
  }
}