package leetcode;

import java.util.Stack;

public class ImplementQueueUsingStacks {

  static class MyQueue {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
      in.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
      if (!out.isEmpty()) {
        return out.pop();
      }

      while (!in.isEmpty()) {
        out.push(in.pop());
      }

      return out.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
      if (!out.isEmpty()) {
        return out.peek();
      }

      while (!in.isEmpty()) {
        out.push(in.pop());
      }

      return out.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
      return in.isEmpty() && out.isEmpty();
    }
  }

}
