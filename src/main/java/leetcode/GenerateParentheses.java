package leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * Approach 2: Backtracking Intuition and Algorithm
 * <p>
 * Instead of adding '(' or ')' every time as in Approach 1, let's only add them when we know it
 * will remain a valid sequence. We can do this by keeping track of the number of opening and
 * closing brackets we have placed so far.
 * <p>
 * We can start an opening bracket if we still have one (of n) left to place. And we can start a
 * closing bracket if it would not exceed the number of opening brackets.
 */
public class GenerateParentheses {

  public List<String> generateParenthesis(int n) {
    List<String> ans = new ArrayList<>();
    backtrack(ans, "", 0, 0, n);
    return ans;
  }

  public void backtrack(List<String> ans, String cur, int open, int close, int max) {
    if (cur.length() == max * 2) {
      ans.add(cur);
      return;
    }

    // start with open
      if (open < max) {
          backtrack(ans, cur + "(", open + 1, close, max);
      }
    // open is bigger than close
      if (close < open) {
          backtrack(ans, cur + ")", open, close + 1, max);
      }
  }
}
