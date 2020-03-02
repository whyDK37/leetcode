package leetcode;

import static leetcode.JewelsAndStones.numJewelsInStones;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class JewelsAndStonesTest {

  @Test
  public void testNumJewelsInStones() {
    assertEquals(numJewelsInStones("aA", "aAAbbbb"), 3);
    assertEquals(numJewelsInStones("z", "ZZ"), 0);
  }
}