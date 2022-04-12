package leetcode;

/**
 * 461 https://leetcode-cn.com/problems/hamming-distance/
 */
public class HammingDistance {

  public int hammingDistance(int x, int y) {
    int s = x ^ y, ret = 0;
    while (s != 0) {
      s &= (s - 1);
      ret++;
    }
    return ret;
  }

  public int hammingDistance2(int x, int y) {
    int s = x ^ y, ret = 0;
    while (s != 0) {
      ret += s & 1;
      s >>= 1;
    }
    return ret;
  }

  public int hammingDistance1(int x, int y) {
    return Integer.bitCount(x ^ y);
  }
}
