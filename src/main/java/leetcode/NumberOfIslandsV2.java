package leetcode;

/**
 * https://leetcode-cn.com/problems/number-of-islands/ 思路： 如果碰到1，则把周围的1都变为0，岛屿的基数 +1。 这个算法在英文里叫
 * floodfill 遇到岛屿，把岛屿沉默，再继续寻找新的岛屿
 */
public class NumberOfIslandsV2 {

  public int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }

    int nr = grid.length;
    int nc = grid[0].length;
    int numIslands = 0;
    for (int r = 0; r < nr; ++r) {
      for (int c = 0; c < nc; ++c) {
        numIslands += sink(grid, r, c);
      }
    }

    return numIslands;

  }

  /**
   * 1. 如果当节点合法并且是 1 ，把当前和周围相邻的1都变为0，并返回1 2. 否则返回 0
   *
   * @param grid 表格
   * @param r    行
   * @param c    列
   * @return 1：岛屿；0：海
   */
  private int sink(char[][] grid, int r, int c) {
    // 终止条件，先判断月结，再判断是否是水
    if (r < 0 || c < 0 || r == grid.length || c == grid[r].length || grid[r][c] == '0') {
      return 0;
    }

    // 当前层逻辑
    grid[r][c] = '0';

    // 深入下一层，先上下左右探测
    sink(grid, r - 1, c);
    sink(grid, r + 1, c);
    sink(grid, r, c - 1);
    sink(grid, r, c + 1);

    return 1;
  }


}
