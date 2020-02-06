package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ValidAnagramTest {

    @Test
    public void testIsAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertFalse(validAnagram.isAnagram("rat", "var"));
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
    }
}