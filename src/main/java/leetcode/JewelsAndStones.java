package leetcode;

public class JewelsAndStones {

  public static int numJewelsInStones(String J, String S) {
    char[] chars = J.toCharArray();
    int count = 0;
    for (char c : S.toCharArray()) {
      for (char aChar : chars) {
        if (c == aChar) {
          count++;
          break;
        }
      }
    }
    return count;
  }
}
