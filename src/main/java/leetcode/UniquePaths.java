package leetcode;

/**
 * 题目介绍:
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to
 * reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 * <p>
 * start 0 0 0 0 0 0
 * 0     0 0 0 0 0 0
 * 0     0 0 0 0 0 finish
 * Above is a 7 x 3 grid. How many possible unique paths are there?
 * Note: m and n will be at most 100.
 * <p>
 * Example 1:
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation:
 * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down
 * 2. Right -> Down -> Right
 * 3. Down -> Right -> Right
 * Example 2:
 * Input: m = 7, n = 3
 * Output: 28
 * ----------------------
 * |28|21|15|10|6 |3 |1 |
 * ----------------------
 * |7 |6 |5 |4 |3 |2 |1 |
 * ----------------------
 * |1 |1 |1 |1 |1 |1 |1 |
 * ----------------------
 * <p>
 * <p>
 * 解题思路：动态规划。
 * 从finish终点倒着推向start点。
 * dp[][]数组的每一个元素表示当前该点作为start点到finish点的路径数。
 * 初始化：
 * dp[rows - 1][i] = 1;
 * dp[i][cols - 1] = 1;
 * 动态规划表达式:
 * dp[i][j] = dp[i][j + 1] + dp[i + 1][j];
 * 最终返回dp[0][0]即可。
 */
public class UniquePaths {
    public int uniquePaths(int cols, int rows) {
        if (cols < 2 || rows < 2) return 1;
        int[][] dp = new int[rows][cols];
        //init
        for (int i = 0; i < cols - 1; i++) dp[rows - 1][i] = 1;//最后一行初始化
        for (int i = 0; i < rows - 1; i++) dp[i][cols - 1] = 1;//最后一列初始化
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = cols - 2; j >= 0; j--) {
                dp[i][j] = dp[i][j + 1] + dp[i + 1][j];
            }
        }
        return dp[0][0];
    }
}
