package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LengthOfLastWordTest {

    @Test
    public void testLengthOfLastWord() {
        assertEquals(new LengthOfLastWord().lengthOfLastWord("a "), 1);
        assertEquals(new LengthOfLastWord().lengthOfLastWord("World"), 5);
        assertEquals(new LengthOfLastWord().lengthOfLastWord("Hello World"), 5);
    }
}