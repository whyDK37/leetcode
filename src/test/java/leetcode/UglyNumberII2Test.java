package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UglyNumberII2Test {

    @Test
    public void testNthUglyNumber() {
        assertEquals(new UglyNumberII2().nthUglyNumber(1), 1);
        assertEquals(new UglyNumberII2().nthUglyNumber(11), 15);
        assertEquals(new UglyNumberII2().nthUglyNumber(10), 12);
    }
}