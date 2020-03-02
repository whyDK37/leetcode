package leetcode;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

  public List<List<String>> solveNQueens(int n) {
    List<List<String>> result = new ArrayList<>();
    queen(result, n, 0, new int[n]);

    return result;
  }

  private void queen(List<List<String>> result, int n, int level, int[] cols) {
    if (level == n) {
      // gen result
      genResult(result, cols);
      return;
    }

    // 尝试 level 行所有的列
    for (int currentCol = 0; currentCol < n; currentCol++) {
      cols[level] = currentCol;
      boolean conflict = false;
      // 判断 level 之前的行是否与当前位置冲突
      for (int preLevel = level - 1; preLevel >= 0; preLevel--) {
        // 位置冲突, 竖撇捺
        if (currentCol == cols[preLevel] ||
            Math.abs(level - preLevel) == Math.abs(currentCol - cols[preLevel])) {
          conflict = true;
          break;
        }
      }
      if (!conflict) {
        queen(result, n, level + 1, cols);
      }
    }
  }

  private void genResult(List<List<String>> result, int[] cols) {
    List<String> oneSolution = new ArrayList<>();
    for (int col : cols) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < cols.length; i++) {
        sb.append(i == col ? 'Q' : '.');
      }
      oneSolution.add(sb.toString());
    }
    result.add(oneSolution);
  }
}
