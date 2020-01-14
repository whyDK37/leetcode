package leetcode;

import org.testng.Assert;

import java.util.HashMap;

/**
 * @author why
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer>[] rows = new HashMap[9];
        HashMap<Character, Integer>[] columns = new HashMap[9];
        HashMap<Character, Integer>[] boxes = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            columns[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == '.') continue;
                if (rows[row].putIfAbsent(board[row][col], 1) != null) {
                    return false;
                }
                if (columns[col].putIfAbsent(board[row][col], 1) != null) {
                    return false;
                }
                int box_index = (row / 3) * 3 + col / 3;
                if (boxes[box_index].putIfAbsent(board[row][col], 1) != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidSudoku validSudoku = new ValidSudoku();

        char[][] a =
                {
                        {'5', '3', '.', '.', '7', '.', '.', '.', '.' },
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.' },
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.' },
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3' },
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1' },
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6' },
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.' },
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5' },
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9' },
                };
        Assert.assertTrue(validSudoku.isValidSudoku(a));

        char[][] b =
                {
                        {'8', '3', '.', '.', '7', '.', '.', '.', '.' },
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.' },
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.' },
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3' },
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1' },
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6' },
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.' },
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5' },
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9' }
                };
        Assert.assertFalse(validSudoku.isValidSudoku(b));

    }

}
