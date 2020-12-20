package leetcode;

/**
 * https://leetcode-cn.com/problems/number-of-islands/ 思路： 如果碰到1，则把周围的1都变为0，岛屿的基数 +1。 这个算法在英文里叫
 * floodfill
 */
public class NumberOfIslands {

  char island = '1';
  char water = '0';

  public int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }

    int nr = grid.length;
    int nc = grid[0].length;
    int numIslands = 0;
    for (int r = 0; r < nr; ++r) {
      for (int c = 0; c < nc; ++c) {
        if (grid[r][c] == island) {
          ++numIslands;
          dfs(grid, r, c);
        }
      }
    }

    return numIslands;

  }

  /**
   * @param grid 表格
   * @param r    行
   * @param c    列
   */
  void dfs(char[][] grid, int r, int c) {
    int nr = grid.length;
    int nc = grid[0].length;

    // 水和越界判断
    if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == water) {
      return;
    }

    grid[r][c] = water;
    dfs(grid, r - 1, c);
    dfs(grid, r + 1, c);
    dfs(grid, r, c - 1);
    dfs(grid, r, c + 1);
  }

}
