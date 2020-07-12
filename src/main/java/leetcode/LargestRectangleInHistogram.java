package leetcode;


public class LargestRectangleInHistogram {

  public int largestRectangleArea(int[] heights) {
    if (heights == null || heights.length == 0) {
      return 0;
    }

    int[] stack = new int[heights.length + 1];
    int idx = -1;
    stack[++idx] = -1;
    int maxArea = 0;
    for (int i = 0; i < heights.length; i++) {
      // 当前元素与栈顶元素比较，如果是下降趋势，计算之前的最大面积
      while (stack[idx] != -1 && heights[i] < heights[stack[idx]]) {
        maxArea = Math.max(maxArea, heights[stack[idx--]] * (i - stack[idx] - 1));
      }
      stack[++idx] = i;
    }

    // 剩余的上升趋势数据，
    // 根据数组长度与数据下表位置计算宽度 * 高度
    while (stack[idx] != -1) {
      maxArea = Math.max(maxArea, heights[stack[idx--]] * (heights.length - stack[idx] - 1));
    }

    return maxArea;
  }
}
