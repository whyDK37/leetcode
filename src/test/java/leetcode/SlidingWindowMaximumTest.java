package leetcode;

import java.util.PriorityQueue;
import leetcode.util.TestUtil;
import org.testng.annotations.Test;

public class SlidingWindowMaximumTest {

  @Test
  public void testMaxSlidingWindow() {
    SlidingWindowMaximum maximum = new SlidingWindowMaximum();
    TestUtil
        .equals(maximum.maxSlidingWindow(new int[]{1, 3, 1, 2, 0, 5}, 3), new int[]{3, 3, 2, 5});
    TestUtil.equals(maximum.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3),
        new int[]{3, 3, 5, 5, 6, 7});
    TestUtil.equals(maximum.maxSlidingWindow(new int[]{}, 0), new int[]{});
  }

  @Test
  public void test() {
    PriorityQueue<Integer> queue = new PriorityQueue<>(1, (o1, o2) -> o2 - o1);
    queue.add(2);
    queue.add(1);
    for (Integer integer : queue) {
      System.out.println(integer);
    }

  }
}