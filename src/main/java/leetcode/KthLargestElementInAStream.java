package leetcode;


import java.util.PriorityQueue;
import org.testng.Assert;

public class KthLargestElementInAStream {

  public static void main(String[] args) {
    KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
    Assert.assertEquals(kthLargest.add(3), 4);
    Assert.assertEquals(kthLargest.add(5), 5);
    Assert.assertEquals(kthLargest.add(10), 5);
    Assert.assertEquals(kthLargest.add(9), 8);
    Assert.assertEquals(kthLargest.add(4), 8);

    kthLargest = new KthLargest(1, new int[]{});
    Assert.assertEquals(kthLargest.add(-3), -3);
    Assert.assertEquals(kthLargest.add(-2), -2);
    Assert.assertEquals(kthLargest.add(-4), -2);
    Assert.assertEquals(kthLargest.add(0), 0);
    Assert.assertEquals(kthLargest.add(4), 4);
  }

  static class KthLargest {

    PriorityQueue<Integer> queue;
    int k;

    public KthLargest(int k, int[] nums) {
      this.k = k;
      queue = new PriorityQueue<>(k);
      for (int num : nums) {
        queue.add(num);
        if (queue.size() > k) {
          queue.poll();
        }
      }
    }

    public int add(int val) {
      if (queue.size() < k) {
        queue.offer(val);
      } else if (queue.peek() < val) {
        queue.poll();
        queue.offer(val);
      }

      return queue.peek();
    }
  }
}
