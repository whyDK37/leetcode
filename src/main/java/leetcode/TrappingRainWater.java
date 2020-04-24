package leetcode;


public class TrappingRainWater {

  public int trap(int[] height) {

          /*

        [0,1,0,2,1,0,1,3,2,1,2,1] original array

        [0,1,1,2,2,2,2,3,3,3,3,3] max from left
        [0,3,3,3,3,3,3,3,2,2,2,1] max from right

        [0,1,1,2,2,2,2,3,2,2,2,1] min of above two
->      [0,1,0,2,1,0,1,3,2,1,2,1] minus the original array
->      [0,0,1,0,1,2,1,0,0,1,0,0] sum = 1+1+2+1+1 = 6

        */
    if (height.length == 0 || height.length == 1) {
      return 0;
    }
    int len = height.length;
    int[] maxFromLeft = new int[len];
    int[] maxFromRight = new int[len];
    int[] min = new int[len];
    maxFromLeft[0] = height[0];
    maxFromRight[len - 1] = height[len - 1];
    for (int i = 1; i < len; i++) {
      maxFromLeft[i] = Math.max(maxFromLeft[i - 1], height[i]);
      maxFromRight[len - i - 1] = Math.max(maxFromRight[len - i], height[len - i - 1]);
    }
    int sum = 0;
    for (int i = 0; i < len; i++) {
      min[i] = Math.min(maxFromLeft[i], maxFromRight[i]);
      sum += (min[i] - height[i]);
    }
    return sum;
  }
}
