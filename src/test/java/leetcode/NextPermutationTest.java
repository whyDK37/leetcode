package leetcode;

import java.util.Arrays;
import leetcode.util.TestUtil;
import org.testng.annotations.Test;

public class NextPermutationTest {

  @Test
  public void testNextPermutation() {
    NextPermutation nextPermutation = new NextPermutation();
    int[] nums = {1, 2, 3};
    nextPermutation.nextPermutation(nums);
    TestUtil.equals(nums, new int[]{1, 3, 2});

    nums = new int[]{3, 2, 1};
    nextPermutation.nextPermutation(nums);
    TestUtil.equals(nums, new int[]{1, 2, 3});

    nums = new int[]{1, 1, 5};
    nextPermutation.nextPermutation(nums);
    TestUtil.equals(nums, new int[]{1, 5, 1});


  }

  @Test
  public void test2() {
    NextPermutation nextPermutation = new NextPermutation();

    int[] nums = new int[]{1, 5, 8, 4, 7, 6, 5, 3, 1};
    nextPermutation.nextPermutation(nums);
    System.out.println(Arrays.toString(nums));
    TestUtil.equals(nums, new int[]{1, 5, 8, 5, 1, 3, 4, 6, 7});
  }

  @Test
  public void test3() {
    NextPermutation nextPermutation = new NextPermutation();

    int[] nums = new int[]{1, 5, 1};
    nextPermutation.nextPermutation(nums);
    System.out.println(Arrays.toString(nums));
    TestUtil.equals(nums, new int[]{5, 1, 1});
  }
}