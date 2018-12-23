package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void testIsValid() {
        assertTrue(new ValidParentheses().isValid("()"));
        assertTrue(new ValidParentheses().isValid("()[]{}"));
        assertTrue(new ValidParentheses().isValid("{[]}"));
        assertFalse(new ValidParentheses().isValid("(]"));
        assertFalse(new ValidParentheses().isValid("([)]"));
    }
}