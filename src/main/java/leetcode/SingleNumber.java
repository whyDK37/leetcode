package leetcode;


public class SingleNumber {

  public int singleNumber(int[] nums) {
    int a = 0;
    for (int i : nums) {
      a ^= i;
      System.out.println(a);
    }
    return a;
  }
}
