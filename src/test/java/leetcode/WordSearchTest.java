package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WordSearchTest {

    @Test
    public void testExist() {
        WordSearch wordSearch = new WordSearch();
        char[][] board =
                {
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                };

        assertTrue(wordSearch.exist(board, "ABCCED"));
        assertTrue(wordSearch.exist(board, "SEE"));
        assertFalse(wordSearch.exist(board, "ABCB"));

    }
}