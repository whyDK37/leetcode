package leetcode;

import java.util.Arrays;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeIntervalsTest {

  @Test
  public void testMerge() {
    MergeIntervals mergeIntervals = new MergeIntervals();

    int[][] numseven = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 20}};
    int[][] merge = mergeIntervals.merge(numseven);

    equals(merge, "[1, 6][8, 10][15, 20]");

  }

  private void equals(int[][] merge, String expected) {
    StringBuilder sb = new StringBuilder();
    for (int[] ints : merge) {
      sb.append(Arrays.toString(ints));
    }
    System.out.println(sb);
    Assert.assertEquals(sb.toString(), expected);
  }

  @Test
  public void testMerge2() {
    MergeIntervals mergeIntervals = new MergeIntervals();

    int[][] numseven = new int[][]{{1, 4}, {4, 5}};
    int[][] merge = mergeIntervals.merge(numseven);
    equals(merge, "[1, 5]");
  }

  @Test
  public void test() {
    int[][] numseven = new int[][]{{1, 4}, {0, 4}};
    for (int[] ints : numseven) {
      for (int anInt : ints) {
        System.out.println(anInt);
      }
    }
  }

  @Test
  public void testMerge3() {
    MergeIntervals mergeIntervals = new MergeIntervals();

    int[][] numseven = new int[][]{{1, 4}, {1, 3}};
    int[][] merge = mergeIntervals.merge(numseven);

    equals(merge, "[1, 4]");

  }

  @Test
  public void testMerge4() {
    MergeIntervals mergeIntervals = new MergeIntervals();

    int[][] numseven = new int[][]{{1, 4}, {2, 3}};
    int[][] merge = mergeIntervals.merge(numseven);

    equals(merge, "[1, 4]");

  }
}