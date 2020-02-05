package leetcode;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    static class MyQueue {

        Stack<Integer> in = new Stack<>();
        Stack<Integer> out = new Stack<>();

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {

        }

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
            if (out.size() != 0) return out.pop();


            while (in.size() > 0) {
                out.push(in.pop());
            }

            return out.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (out.size() != 0) return out.peek();

            while (in.size() > 0) {
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

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        System.out.println("obj.peek() = " + obj.peek());
        System.out.println("obj.pop() = " + obj.pop());
        System.out.println("obj.empty() = " + obj.empty());
    }
}
