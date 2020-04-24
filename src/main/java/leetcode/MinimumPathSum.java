package leetcode;


public class MinimumPathSum {

  public int minPathSum(int[][] grid) {

    int rowLen = grid.length;
    int colLen = grid[0].length;
    int[][] min = new int[rowLen][colLen];
    min[rowLen - 1][colLen - 1] = grid[rowLen - 1][colLen - 1];
    for (int j = 2; j <= rowLen; j++) {
      min[rowLen - j][colLen - 1] = min[rowLen - j + 1][colLen - 1] + grid[rowLen - j][colLen - 1];
    }
    for (int i = 2; i <= colLen; i++) {
      min[rowLen - 1][colLen - i] = min[rowLen - 1][colLen - i + 1] + grid[rowLen - 1][colLen - i];
    }

    for (int row = grid.length - 2; row >= 0; row--) {
      for (int col = grid[row].length - 2; col >= 0; col--) {

        if (min[row][col] == 0) {
          min[row][col] = Math.min(min[row + 1][col] + grid[row][col],
              min[row][col + 1] + grid[row][col]);
        }
      }
    }

    return min[0][0];
  }
}
