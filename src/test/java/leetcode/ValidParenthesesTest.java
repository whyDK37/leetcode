package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ValidParenthesesTest {

  @Test
  public void testIsValid() {
    assertTrue(new ValidParentheses().isValid("((()(())))"));
    assertTrue(new ValidParentheses().isValid("()"));
    assertTrue(new ValidParentheses().isValid("()[]{}"));
    assertTrue(new ValidParentheses().isValid("{[]}"));
    assertFalse(new ValidParentheses().isValid("(((((((()"));
    assertFalse(new ValidParentheses().isValid("(]"));
    assertFalse(new ValidParentheses().isValid("([)]"));
  }
}