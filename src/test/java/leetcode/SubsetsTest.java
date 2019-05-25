package leetcode;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class SubsetsTest {

    @Test
    public void testSubsets() {

        Subsets subsets = new Subsets();

        List<List<Integer>> subsets1 = subsets.subsets(new int[]{1, 2, 3});
        System.out.println(subsets1);
    }

}