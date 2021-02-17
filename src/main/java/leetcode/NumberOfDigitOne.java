package leetcode;


/**
 * https://leetcode-cn.com/problems/number-of-digit-one/solution/shu-zi-1-de-ge-shu-by-leetcode/
 * <p>
 * https://leetcode.com/problems/number-of-digit-one/discuss/64381/4%2B-lines-O(log-n)-C%2B%2BJavaPython
 */
public class NumberOfDigitOne {

  public int countDigitOne(int n) {
    int countr = 0;
    for (long i = 1; i <= n; i *= 10) {
      long divider = i * 10;
      countr += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0L), i);
    }
    return countr;
  }

}
