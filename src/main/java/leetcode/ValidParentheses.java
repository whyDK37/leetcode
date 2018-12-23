package leetcode;


public class ValidParentheses {
    public boolean isValid(String s) {
        char[] parentheses = new char[s.length()];
        int pi = 0;

        for (char aChar : s.toCharArray()) {
            if (aChar == '(' || aChar == '[' || aChar == '{') {
                parentheses[pi++] = aChar;
            } else {
                if (pi == 0) return false;
                char parenthesis = parentheses[pi - 1];
                switch (parenthesis) {
                    case '(':
                        if (aChar != ')') return false;
                        break;
                    case '[':
                        if (aChar != ']') return false;
                        break;
                    case '{':
                        if (aChar != '}') return false;
                        break;
                    default:
                        return false;
                }
                pi--;
            }

        }
        return pi == 0;
    }
}
