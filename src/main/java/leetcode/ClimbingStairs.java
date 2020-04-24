package leetcode;


/**
 * 蒙蔽的时候看是否可以暴力破解，如果不能分析基本情况(最简单的情况)，也就是找最近重复子问题
 *
 * <pre>
 * 1: 1
 * 2: 2
 * 3: f(1) + f(2)
 * 4: f(3) + f(3)
 * 所以，这是 Fibonacci
 * f(n) = f(n-1) + f(n-2)
 * </pre>
 */
public class ClimbingStairs {

  public int climbStairs(int n) {
    if (n <= 2) {
      return n;
    }

    int f1 = 1, f2 = 2, f3 = 3;
    for (int i = 3; i <= n; i++) {
      f3 = f2 + f1;
      f1 = f2;
      f2 = f3;
    }

    return f3;
  }
}
