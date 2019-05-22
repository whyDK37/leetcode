package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MinimumWindowSubstringTest {

    @Test
    public void testMinWindow() {
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();

        assertEquals(minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"), "BANC");

    }
}