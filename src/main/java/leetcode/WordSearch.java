package leetcode;


/**
 * https://leetcode-cn.com/problems/word-search/
 */
public class WordSearch {

  int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

  public boolean exist(char[][] board, String word) {
    int h = board.length, w = board[0].length;
    boolean[][] visited = new boolean[h][w];
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        boolean flag = check(board, visited, i, j, word, 0);
        if (flag) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
    if (board[i][j] != s.charAt(k)) {
      return false;
    } else if (k == s.length() - 1) {
      return true;
    }
    visited[i][j] = true;
    boolean result = false;
    for (int[] dir : directions) {
      int newI = i + dir[0], newJ = j + dir[1];
      if (inRange(board, newI, newJ)) {
        if (!visited[newI][newJ]) {
          boolean flag = check(board, visited, newI, newJ, s, k + 1);
          if (flag) {
            result = true;
            break;
          }
        }
      }
    }
    visited[i][j] = false;
    return result;
  }

  private boolean inRange(char[][] board, int newi, int newj) {
    return newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length;
  }
}
