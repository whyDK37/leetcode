package leetcode;

import java.util.Arrays;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZeroesTest {

  @Test
  public void testMoveZeroes() {
    MoveZeroes moveZeroes = new MoveZeroes();

    int[] nums = new int[]{1, 2, 3, 0, 0};
    moveZeroes.moveZeroes(nums);
    Assert.assertEquals(Arrays.toString(nums), Arrays.toString(new int[]{1, 2, 3, 0, 0}));

    nums = new int[]{0, 1, 0, 3, 12};
    moveZeroes.moveZeroes(nums);
    Assert.assertEquals(Arrays.toString(nums), Arrays.toString(new int[]{1, 3, 12, 0, 0}));

    nums = new int[]{0, 0, 0, 0, 0};
    moveZeroes.moveZeroes(nums);
    Assert.assertEquals(Arrays.toString(nums), Arrays.toString(new int[]{0, 0, 0, 0, 0,}));

    nums = new int[]{};
    moveZeroes.moveZeroes(nums);
    Assert.assertEquals(Arrays.toString(nums), Arrays.toString(new int[]{}));

  }
}