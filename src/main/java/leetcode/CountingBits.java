package leetcode;

/**
 * 338 https://leetcode-cn.com/problems/counting-bits/
 */
public class CountingBits {

  public int[] countBits(int n) {
    int[] bits = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      bits[i] = Integer.bitCount(i);
    }
    return bits;

  }

  public int countOnes(int x) {
    int ones = 0;
    while (x > 0) {
      x &= (x - 1);
      ones++;
    }
    return ones;
  }
}
