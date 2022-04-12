package leetcode;


/**
 * 真假为假，真真为真，假假为真
 * 136 https://leetcode-cn.com/problems/single-number/
 */
public class SingleNumber {

  public int singleNumber(int[] nums) {
    int a = 0;
    for (int i : nums) {
      a ^= i;
    }
    return a;
  }
}
