package leetcode;

public class PalindromeNumber {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    if (x < 10) {
      return true;
    }

    int reverse = 0;
    int ori = x;
    while (ori > 0) {
      int remain = ori % 10;
      ori = ori / 10;

      reverse = reverse * 10 + remain;
    }
    return reverse == x;
  }
}
