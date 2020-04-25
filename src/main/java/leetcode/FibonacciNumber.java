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
    if (n <= 0) {
      return 0;
    }
    if (n <= 2) {
      return 1;
    }

    int f1 = 1, f2 = 1, f3 = 2;
    for (int i = 3; i <= n; i++) {
      f3 = f1 + f2;
      f1 = f2;
      f2 = f3;
    }

    return f3;
  }
}
