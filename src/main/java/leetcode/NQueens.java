package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/n-queens/
 */
public class NQueens {

  public List<List<String>> solveNQueens(int n) {
    List<List<String>> result = new ArrayList<>();
    queen(result, n, 0, new int[n]);

    return result;
  }

  /**
   * rows 下标表示行，元素表示列
   *
   * @param result
   * @param n
   * @param level
   * @param rows
   */
  private void queen(List<List<String>> result, int n, int level, int[] rows) {
    // 终止条件
    if (level == n) {
      // gen result
      genResult(result, rows);
      return;
    }

    // 尝试 level 行所有的列
    for (int currentColumn = 0; currentColumn < n; currentColumn++) {
      rows[level] = currentColumn;
      boolean conflict = false;
      // 判断 level 之前的行是否与当前位置冲突
      for (int preLevel = level - 1; preLevel >= 0; preLevel--) {
        // 位置冲突, 竖撇捺（比较横竖的绝对值）
        if (currentColumn == rows[preLevel] || Math.abs(level - preLevel) == Math.abs(currentColumn - rows[preLevel])) {
          conflict = true;
          break;
        }
      }
      if (!conflict) {
        queen(result, n, level + 1, rows);
      }
    }
  }

  /**
   * 输出棋盘
   *
   * @param result
   * @param rows
   */
  private void genResult(List<List<String>> result, int[] rows) {
    List<String> oneSolution = new ArrayList<>();
    for (int row : rows) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < rows.length; i++) {
        sb.append(i == row ? 'Q' : '.');
      }
      oneSolution.add(sb.toString());
    }
    result.add(oneSolution);
  }
}
