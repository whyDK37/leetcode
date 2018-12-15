package leetcode;


public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        if (height == null || height.length < 2) return 0;

        int start = 0, end = height.length - 1, maxarea = 0;
        while (end > start) {
            if (height[start] < height[end]) {
                maxarea = Math.max(maxarea, height[start] * (end - start));
                start++;
            } else {
                maxarea = Math.max(maxarea, height[end] * (end - start));
                end--;
            }
        }
        return maxarea;
    }
}
