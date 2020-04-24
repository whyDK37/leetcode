package leetcode;


import java.util.Arrays;

/**
 * 如何计算两个字符串之间的文本相似度? https://juejin.im/post/5dca66e0e51d456a2e6556f8#heading-2
 */
public class EditDistance {

  public int minDistance(String word1, String word2) {
    int x = word1.length();
    int y = word2.length();

    if (x == 0 || y == 0) {
      return Math.max(x, y);
    }

    int[][] d = new int[x + 1][y + 1];

    // init column and row
    for (int i = 0; i < x + 1; i++) {
      d[i][0] = i;
    }
    for (int i = 0; i < y + 1; i++) {
      d[0][i] = i;
    }

    for (int i = 1; i < x + 1; i++) {
      for (int j = 1; j < y + 1; j++) {
        int leftDown = d[i - 1][j - 1];
        if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
          leftDown += 1;
        }
        d[i][j] = Math.min(d[i - 1][j] + 1, Math.min(d[i][j - 1] + 1, leftDown));

      }
    }

    return d[x][y];
  }

  void print(int[][] v) {
    for (int[] ints : v) {
      System.out.println(Arrays.toString(ints));
    }
  }
}
