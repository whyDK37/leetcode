package leetcode;

import org.testng.annotations.Test;

import static leetcode.String2IntegerAtoi.myAtoi;
import static org.testng.Assert.*;

public class String2IntegerAtoiTest {

    @Test
    public void testMyAtoi() {
        assertEquals(myAtoi("42"), 42);
        assertEquals(myAtoi("   -42"), -42);
        assertEquals(myAtoi("4193 with words"), 4193);
        assertEquals(myAtoi("words and 987"), 0);
        assertEquals(myAtoi("-91283472332"), -2147483648);
    }
}