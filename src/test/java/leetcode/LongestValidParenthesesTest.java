package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LongestValidParenthesesTest {

    @Test
    public void testLongestValidParentheses() {
        LongestValidParentheses test = new LongestValidParentheses();
        assertEquals(test.longestValidParentheses(")()())"), 4);
        assertEquals(test.longestValidParentheses("(())"), 4);
        assertEquals(test.longestValidParentheses("()(()"), 2);
        assertEquals(test.longestValidParentheses("((((((()"), 2);
        assertEquals(test.longestValidParentheses("(()"), 2);
        assertEquals(test.longestValidParentheses(")()())()"), 4);
    }
}