package leetcode;

import java.util.Iterator;
import java.util.PriorityQueue;

public class SlidingWindowMaximumV2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k == 0 || nums.length == 0 || nums.length < k) return new int[0];

        int[] res = new int[nums.length - k + 1];
        PriorityQueue<Integer> queue = new PriorityQueue<>(k + 1, (o1, o2) -> o2 - o1);
        for (int s = 0, ri = 0; s < nums.length; s++) {
            if (queue.size() == k) {
                Iterator<Integer> iterator = queue.iterator();
                while (iterator.hasNext()) {
                    if (nums[s - k] == iterator.next()) {
                        iterator.remove();
                        break;
                    }
                }
            }

            queue.add(nums[s]);
            // 达到窗口大小，开始维护结果集
            if (s >= k - 1) {
                res[ri++] = queue.peek();
            }
        }

        return res;
    }
}
