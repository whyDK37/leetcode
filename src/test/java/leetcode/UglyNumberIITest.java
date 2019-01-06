package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UglyNumberIITest {

    @Test
    public void testNthUglyNumber() {
        assertEquals(new UglyNumberII().nthUglyNumber(1), 1);
        assertEquals(new UglyNumberII().nthUglyNumber(11), 15);
        assertEquals(new UglyNumberII().nthUglyNumber(10), 12);

    }
}