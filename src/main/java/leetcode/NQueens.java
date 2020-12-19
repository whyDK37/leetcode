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
   * @param result 结果
   * @param n      一共有多少行
   * @param level  当前行
   * @param rows   保存每一行皇后的位置
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
        if (currentColumn == rows[preLevel] || Math.abs(level - preLevel) == Math
            .abs(currentColumn - rows[preLevel])) {
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
   * @param result 结果
   * @param rows   摆放皇后的位置
   */
  protected void genResult(List<List<String>> result, int[] rows) {
    List<String> oneSolution = new ArrayList<>();
    StringBuilder rowSb = new StringBuilder();
    for (int row : rows) {
      rowSb.delete(0, rowSb.length() - 1);
      for (int i = 0; i < rows.length; i++) {
        rowSb.append(i == row ? 'Q' : '.');
      }
      oneSolution.add(rowSb.toString());
    }
    result.add(oneSolution);
  }
}
