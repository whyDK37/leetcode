package alg;

/**
 * 如何计算两个字符串之间的文本相似度?
 * https://juejin.im/post/5dca66e0e51d456a2e6556f8#heading-2
 */
public class EditDisDemo {

  public static void main(String[] args) {
    System.out.println(editDis("dog", "apple"));
    System.out.println(editDis("abc", "bcd"));
    System.out.println(Levenshtein("abcde", "abce"));
  }

  public static float Levenshtein(String a, String b) {
    if (a == null && b == null) {
      return 1f;
    }
    if (a == null || b == null) {
      return 0F;
    }
    int editDistance = editDis(a, b);
    return 1 - ((float) editDistance / Math.max(a.length(), b.length()));
  }

  private static int editDis(String a, String b) {

    int aLen = a.length();
    int bLen = b.length();

    if (aLen == 0) {
      return aLen;
    }
    if (bLen == 0) {
      return bLen;
    }

    int[][] v = new int[aLen + 1][bLen + 1];
    for (int i = 0; i <= aLen; ++i) {
      for (int j = 0; j <= bLen; ++j) {
        if (i == 0) {
          v[i][j] = j;
        } else if (j == 0) {
          v[i][j] = i;
        } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
          v[i][j] = v[i - 1][j - 1];
        } else {
          v[i][j] = 1 + Math.min(v[i - 1][j - 1], Math.min(v[i][j - 1], v[i - 1][j]));
        }
      }
    }
    return v[aLen][bLen];
  }
}
