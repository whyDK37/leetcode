package leetcode;


import java.util.Stack;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
//                Integer pop = stack.pop();
//                if (!stack.isEmpty()) {
//                    pop = stack.pop();
//                }
//                maxCount = Math.max(maxCount, i - pop);
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxCount = Math.max(maxCount, i - stack.peek());
                }
            }
        }

        return maxCount;
    }
}
