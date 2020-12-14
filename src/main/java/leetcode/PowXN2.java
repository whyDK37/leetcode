package leetcode;

/**
 * https://leetcode.com/problems/powx-n/
 * 分支实现
 */
public class PowXN2 {

  public double myPow(double x, int n) {
    // 处理负数
    long N = n;
    if (N < 0) {
      x = 1 / x;
      N = -N;
    }

    return fastPow(x, N);
  }

  private double fastPow(double x, long n) {
    // 终止条件
    if (n == 0) {
      return 1.0;
    }

    // 处理子问题
    double half = fastPow(x, n / 2);

    // 生成结果
    if (n % 2 == 0) {
      return half * half;
    } else {
      return half * half * x;
    }
  }
}
