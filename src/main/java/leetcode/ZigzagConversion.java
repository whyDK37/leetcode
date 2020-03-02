package leetcode;

public class ZigzagConversion {

  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }

    StringBuilder[] builders = new StringBuilder[Math.min(numRows, s.length())];
    for (int i = 0; i < builders.length; i++) {
      builders[i] = new StringBuilder();
    }

    boolean down = false;
    int curRow = 0;
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      builders[curRow].append(chars[i]);

      if (curRow == numRows - 1 || curRow == 0) {
        down = !down;
      }
      curRow += down ? 1 : -1;

    }

    for (int i = 1; i < builders.length; i++) {
      builders[0].append(builders[i]);
    }

    return builders[0].toString();
  }
}
