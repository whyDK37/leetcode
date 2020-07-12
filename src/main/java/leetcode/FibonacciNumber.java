package leetcode;

/**
 * <pre>
 *
 * 斐波那契数列格式为：0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，
 * 4181，6765，10946，17711，28657，46368、......,n=1和n=2的时候都是输出1
 *
 * </pre>
 */
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
