package leetcode;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class PermutationsTest {

    @Test
    public void testPermute() {
        Permutations permutations = new Permutations();

        List<List<Integer>> permute = permutations.permute(new int[]{1, 2, 3});
        System.out.println(permute);
        assertEquals(permute.size(), 6);

    }
}