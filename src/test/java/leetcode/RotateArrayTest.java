package leetcode;

import java.util.Arrays;
import org.testng.annotations.Test;

public class RotateArrayTest {

  @Test
  public void testRotate() {
    RotateArray rotateArray = new RotateArray();
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(Arrays.toString(nums));
    rotateArray.rotate(nums, 3);
    System.out.println(Arrays.toString(nums));

    nums = new int[]{-1};
    rotateArray.rotate(nums, 2);
    System.out.println(Arrays.toString(nums));

    nums = new int[]{1, 2};
    rotateArray.rotate(nums, 3);
    System.out.println(Arrays.toString(nums));
  }
}