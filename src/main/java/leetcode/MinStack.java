package leetcode;


public class MinStack {

    private int[] stack;
    private int[] min;
    int size = 0;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new int[16];
    }

    public void push(int x) {
        if (stack.length == size) {
            int[] ints = new int[stack.length * 2];
            System.arraycopy(stack, 0, ints, 0, size);
            stack = ints;
        }

        stack[size++] = x;
    }

    public void pop() {
        size--;
    }

    public int top() {
        return stack[size - 1];
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            min = Math.min(min, stack[i]);
        }
        return min;
    }
}
