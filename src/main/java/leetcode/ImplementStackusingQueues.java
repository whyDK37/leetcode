package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {
    static class MyStack {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> bak = new LinkedList<>();

        /**
         * Initialize your data structure here.
         */
        public MyStack() {

        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            queue.add(x);
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            if (queue.isEmpty()) return -1;
            while (queue.size() > 1) {
                bak.add(queue.poll());
            }
            Integer poll = queue.poll();
            swap();
            return poll;
        }

        /**
         * Get the top element.
         */
        public int top() {
            if (queue.isEmpty()) return -1;
            while (queue.size() > 1) {
                bak.add(queue.poll());
            }
            Integer poll = queue.peek();
            bak.add(queue.poll());
            swap();
            return poll;
        }

        private void swap() {
            Queue<Integer> tmp = this.queue;
            queue = bak;
            bak = tmp;
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return queue.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);

        obj.push(2);
        obj.push(3);
        System.out.println("obj.top() = " + obj.top());
        System.out.println("obj.top() = " + obj.top());
        System.out.println("obj.pop() = " + obj.pop());
        System.out.println("obj.pop() = " + obj.pop());
        System.out.println("obj.pop() = " + obj.pop());
        System.out.println("obj.empty() = " + obj.empty());
    }
}
