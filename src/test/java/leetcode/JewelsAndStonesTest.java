package leetcode;

import org.testng.annotations.Test;

import static leetcode.JewelsAndStones.numJewelsInStones;
import static org.testng.Assert.assertEquals;

public class JewelsAndStonesTest {

    @Test
    public void testNumJewelsInStones() {
        assertEquals(numJewelsInStones("aA", "aAAbbbb"), 3);
        assertEquals(numJewelsInStones("z", "ZZ"), 0);
    }
}