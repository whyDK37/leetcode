package leetcode;

import static org.testng.Assert.assertEquals;

import java.util.List;
import org.testng.annotations.Test;

public class PermutationsIITest {

  @Test
  public void testPermute() {

    PermutationsII permutations = new PermutationsII();

    List<List<Integer>> permute = permutations.permuteUnique(new int[]{1, 1, 2});
    System.out.println(permute);
    assertEquals(permute.size(), 3);
  }
}