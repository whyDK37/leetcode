package leetcode;

public class PowXN {

  public double myPow(double x, int n) {
    // 防止越界
    long N = n;
    if (N < 0) {
      x = 1 / x;
      N = -N;
    }
    double ans = 1;
    double current_product = x;
    for (long i = N; i > 0; i >>= 1) {
      // n 减半后，判断 n 是奇数，多乘一个 x
      if ((i & 1) == 1) {
        ans = ans * current_product;
      }
      current_product = current_product * current_product;
    }
    return ans;
  }

  public static void main(String[] args) {
    int n = -12;
    echo(n);
  }

  private static void echo(int n) {
    n = -n;
    System.out.println(n);
  }
}