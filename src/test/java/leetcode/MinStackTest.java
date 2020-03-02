package leetcode;

import org.testng.annotations.Test;

public class MinStackTest {

  @Test
  public void test() {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin();
    minStack.pop();
    minStack.top();
    minStack.getMin();
  }


}