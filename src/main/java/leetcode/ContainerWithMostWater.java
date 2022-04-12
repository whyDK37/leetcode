package leetcode;


/**
 * 11 https://leetcode-cn.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    if (height == null || height.length < 2) {
      return 0;
    }

    int maxarea = 0;
    for (int start = 0, end = height.length - 1; start < end; ) {
      maxarea = Math.max(maxarea,
          (end - start) * (height[start] > height[end] ? height[end--] : height[start++]));
    }
    return maxarea;
  }
}
