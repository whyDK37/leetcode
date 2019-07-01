package leetcode;


public class MinStack {

    private int[] stack;
    private int size = 0;

    private MinNode[] minNode;
    private int minSize = 0;


    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new int[16];
        minNode = new MinNode[16];
        // 用最大值保存一个哨兵，简化判断
        minNode[0] = new MinNode(-1, Integer.MAX_VALUE);
        minSize++;
    }

    public void push(int x) {
        if (stack.length == size) {
            int[] ints = new int[stack.length * 2];
            System.arraycopy(stack, 0, ints, 0, size);
            stack = ints;
        }
        tryAddMin(x);

        stack[size++] = x;
    }


    public void pop() {
        tryRemoveMin();
        size--;
    }

    public int top() {
        return stack[size - 1];
    }

    public int getMin() {
        return minNode[minSize - 1].val;
    }

    /**
     * 最小数字和最小数字对应的栈下标
     */
    class MinNode {
        int index;
        int val;

        public MinNode(int index, int val) {
            this.index = index;
            this.val = val;
        }
    }

    private void tryAddMin(int x) {
        int minTmp = Math.min(minNode[minSize - 1].val, x);
        if (minTmp < minNode[minSize - 1].val) {
            if (minNode.length == minSize) {
                MinNode[] minNodes = new MinNode[minNode.length * 2];
                System.arraycopy(minNode, 0, minNodes, 0, minSize);
                minNode = minNodes;
            }
            minNode[minSize++] = new MinNode(size, x);
        }
    }

    private void tryRemoveMin() {
        if (minNode[minSize - 1].index == (size - 1)) {
            minNode[--minSize] = null;
        }
    }
}
