package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

  public int[] maxSlidingWindow(int[] nums, int k) {
    if (nums == null || k == 0 || nums.length == 0 || nums.length < k) {
      return new int[0];
    }

    int[] res = new int[nums.length - k + 1];
    Deque<Integer> linkedList = new LinkedList<>();
    for (int s = 0, ri = 0; s < nums.length; s++) {
      if (!linkedList.isEmpty() && linkedList.peekFirst() <= s - k) {
        linkedList.pop();
      }
      while (!linkedList.isEmpty() && nums[s] >= nums[linkedList.peekLast()]) {
        linkedList.pop();
      }

      linkedList.add(s);
      // 达到窗口大小，开始维护结果集
      if (s >= k - 1) {
        res[ri++] = nums[linkedList.peekFirst()];
      }
    }

    return res;
  }
}
