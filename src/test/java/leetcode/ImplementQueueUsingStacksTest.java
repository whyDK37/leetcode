package leetcode;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import leetcode.ImplementQueueUsingStacks.MyQueue;
import org.testng.annotations.Test;

public class ImplementQueueUsingStacksTest {

  @Test
  public void test() {
    MyQueue myQueue = new MyQueue();
    myQueue.push(1);
    assertEquals(myQueue.peek(), 1);
    assertEquals(myQueue.pop(), 1);
    assertTrue(myQueue.empty());
  }

}