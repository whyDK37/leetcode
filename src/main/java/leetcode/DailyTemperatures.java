package leetcode;

import java.util.Stack;

/**
 * 739 https://leetcode-cn.com/problems/daily-temperatures/
 * <p>
 * 单调栈
 */
public class DailyTemperatures {

  public int[] dailyTemperatures(int[] temperatures) {

    int[] ans = new int[temperatures.length];
    Stack<Integer> stack = new Stack<>();// 保存温度坐标

    for (int i = 0; i < temperatures.length; i++) {

      while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
        ans[stack.peek()] = i - stack.pop();
      }
      stack.push(i);

    }

    return ans;
  }
}