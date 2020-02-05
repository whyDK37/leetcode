package leetcode;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    static class MyQueue {

        Stack<Integer> push = new Stack<>();
        Stack<Integer> pop = new Stack<>();

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {

        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            push.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            if (push.size() == 0) return -1;

            while (push.size() > 1) {
                pop.push(push.pop());
            }

            Integer peek = push.pop();
            while (pop.size() > 0) {
                push.push(pop.pop());
            }

            return peek;
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (push.size() == 0) return -1;

            while (push.size() > 1) {
                pop.push(push.pop());
            }

            Integer peek = push.peek();
            while (pop.size() > 0) {
                push.push(pop.pop());
            }

            return peek;
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return push.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        System.out.println("obj.pop() = " + obj.pop());
        System.out.println("obj.peek() = " + obj.peek());
        System.out.println("obj.empty() = " + obj.empty());
    }
}
