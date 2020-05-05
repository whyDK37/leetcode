package leetcode;


public class LargestRectangleInHistogram {

  public int largestRectangleArea(int[] heights) {
    if (heights == null || heights.length == 0) {
      return 0;
    }

    int area = 0;
    for (int i = 0; i < heights.length; i++) {
      int min = Integer.MAX_VALUE;
      for (int j = i; j < heights.length; j++) {
        min = Math.min(min, heights[j]);
        area = Math.max((j - i + 1) * min, area);
      }
    }
    return area;
  }
}
