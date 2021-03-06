package leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/
 *
 * <p>
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

  /**
   * 首先定义好递归函数
   *
   * @param ans   结果集合
   * @param cur   当前字符串
   * @param open  左括号个数
   * @param close 右括号个数
   * @param max   最大数量
   */
  public void backtrack(List<String> ans, String cur, int open, int close, int max) {
    // terminator
    if (open == max && close == max) {
      ans.add(cur);
      return;
    }

    // process current logic

    // drill down
    // 左括号，只要小于 max ，就加
    if (open < max) {
      backtrack(ans, cur + "(", open + 1, close, max);
    }
    // 右括号,只要小于左括号就加
    if (close < open) {
      backtrack(ans, cur + ")", open, close + 1, max);
    }

    // restore current status
  }
}
