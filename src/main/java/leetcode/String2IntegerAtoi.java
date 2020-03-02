package leetcode;

public class String2IntegerAtoi {

  public int myAtoi(String str) {
    char[] chars = str.toCharArray();
    boolean begin = false;
    int sign = 1;
    long result = 0;

    int i = 0;
    for (; i < chars.length; i++) {
      if (chars[i] != ' ') {
        break;
      }
    }

    for (; i < chars.length; i++) {
      char aChar = chars[i];

      if (aChar == '-' && !begin) {
        sign = -1;
        begin = true;
      } else if (aChar == '+' && !begin) {
        begin = true;
      } else if (isDigit(aChar)) {
        begin = true;
        result = result * 10 + (aChar - 48);

      } else if (!isDigit(aChar) || begin) {
        break;
      }

      //during each loop keep checcking if the number formed is in the limit or not
      if (result > Integer.MAX_VALUE) {
        if (sign == -1) {
          return Integer.MIN_VALUE;
        } else {
          return Integer.MAX_VALUE;
        }

      }

    }

    if (!begin) {
      return 0;
    }

    return (int) (sign * result);
  }

  private boolean isDigit(char aChar) {
    return aChar >= '0' && aChar <= '9';
  }

}
