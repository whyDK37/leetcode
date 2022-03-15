package leetcode;


import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://leetcode-cn.com/problems/Climbing-Stairs/
 *
 * <p>
 * 蒙蔽的时候看是否可以暴力破解，如果不能分析基本情况(最简单的情况)，
 * <p>
 * 也就是找最近重复子问题
 *
 * <pre>
 * 题目解析
 * 1: 1
 * 2: 2
 * 3: f(1) + f(2)
 * 4: f(3) + f(3)
 * 所以，这是 Fibonacci
 * f(n) = f(n-1) + f(n-2)
 * 台阶数：1  2  3  4  5  6
 *    解：1  2  3  5  8  13
 *
 * 这道题和斐波那契是有点区别的，下面是斐波那契的说明
 * 斐波那契数列格式为：0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，
 * 4181，6765，10946，17711，28657，46368、......,n=1和n=2的时候都是输出1
 *
 * </pre>
 */
public class ClimbingStairs {

  public static void main(String[] args) {
    System.out.println(Stream.of("ab,cd").collect(Collectors.toList()));
  }

  public int climbStairs(int n) {
    if (n <= 2) {
      return n;
    }

    int i1 = 1, i2 = 2, i3 = 0;
    for (int i = 2; i < n; i++) {
      i3 = i1 + i2;
      i1 = i2;
      i2 = i3;
    }

    return i3;
  }
}
