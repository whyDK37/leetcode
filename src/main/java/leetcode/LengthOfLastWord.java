package leetcode;


public class LengthOfLastWord {

  public int lengthOfLastWord(String s) {
    char[] chars = s.toCharArray();
    int count = 0;
    int lastIndex = chars.length - 1;

    // skip tail
    while (lastIndex >= 0) {
      if (chars[lastIndex] != ' ') {
        break;
      }
      lastIndex--;
    }

    while (lastIndex >= 0) {
      if (chars[lastIndex] == ' ') {
        break;
      }
      count++;
      lastIndex--;
    }
    return count;
  }
}
