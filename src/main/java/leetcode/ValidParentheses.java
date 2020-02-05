package leetcode;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    private static Map<Character, Character> characterMap = new HashMap<>(5);

    static {
        characterMap.put(')', '(');
        characterMap.put(']', '[');
        characterMap.put('}', '{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char aChar : s.toCharArray()) {
            // 压栈
            if (!characterMap.containsKey(aChar)) {
                stack.push(aChar);
            } else if (stack.isEmpty() || stack.pop() != characterMap.get(aChar)) {
                return false;
            }

        }

        return stack.isEmpty();
    }
}
