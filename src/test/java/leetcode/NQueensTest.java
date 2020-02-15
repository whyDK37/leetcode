package leetcode;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class NQueensTest {

    @Test
    public void testSolveNQueens() {
        NQueens nQueens = new NQueens();
        System.out.println("nQueens.solveNQueens(0) = " + nQueens.solveNQueens(0));
        System.out.println("nQueens.solveNQueens(1) = " + nQueens.solveNQueens(1));
        System.out.println("nQueens.solveNQueens(2) = " + nQueens.solveNQueens(2));
        System.out.println("nQueens.solveNQueens(3) = " + nQueens.solveNQueens(3));
        List<List<String>> lists = nQueens.solveNQueens(4);
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}