package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ValidAnagramTest {

  @Test
  public void testIsAnagram() {
    ValidAnagram validAnagram = new ValidAnagram();
    assertFalse(validAnagram.isAnagram("rat", "var"));
    assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
  }
}