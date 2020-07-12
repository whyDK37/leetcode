package leetcode;

public class FibonacciNumber {

  public int fib(int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    int[] res = new int[]{0, 0, 1, 0};
    for (int i = 2; i <= n; i++) {
      res[3] = res[1] + res[2];
      res[1] = res[2];
      res[2] = res[3];
    }

    return res[3];
  }
}
