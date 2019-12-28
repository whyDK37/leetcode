package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class String2IntegerAtoiTest {

    @Test
    public void testMyAtoi() {
        String2IntegerAtoi atoi = new String2IntegerAtoi();
        assertEquals(atoi.myAtoi("9223372036854775808"), 2147483647);
        assertEquals(atoi.myAtoi("+-2"), 0);
        assertEquals(atoi.myAtoi("+1"), 1);
        assertEquals(atoi.myAtoi("-91283472332"), -2147483648);
        assertEquals(atoi.myAtoi("   -42"), -42);
        assertEquals(atoi.myAtoi("42"), 42);
        assertEquals(atoi.myAtoi("  4193 with words"), 4193);
        assertEquals(atoi.myAtoi("words and 987"), 0);
    }
}