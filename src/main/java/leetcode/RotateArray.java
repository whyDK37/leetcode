package leetcode;

/**
 * https://leetcode.com/problems/rotate-array/
 * <p>
 * https://leetcode-cn.com/problems/rotate-array/solution/xuan-zhuan-shu-zu-by-leetcode/
 */
public class RotateArray {

  public void rotate(int[] nums, int k) {
    k = nums.length < k ? k % nums.length : k;
    int[] tmp = new int[k];
    // move to tmp array
    System.arraycopy(nums, nums.length - k, tmp, 0, tmp.length);
    // 把原数组向后移动 k 个位置
    System.arraycopy(nums, 0, nums, k, nums.length - k);
    System.arraycopy(tmp, 0, nums, 0, tmp.length);
  }
}
