package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstMissingPositiveTest {

    @Test
    public void testFirstMissingPositive() {
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        assertEquals(firstMissingPositive.firstMissingPositive(new int[]{-1, 0, -2, -3}), 1);
        assertEquals(firstMissingPositive.firstMissingPositive(new int[]{0, 1, 1, 1, 1}), 2);
        assertEquals(firstMissingPositive.firstMissingPositive(new int[]{0, 2, 2, 2, 2}), 1);
        assertEquals(firstMissingPositive.firstMissingPositive(new int[]{0, 2, 2, 1, 1}), 3);
        assertEquals(firstMissingPositive.firstMissingPositive(new int[]{-5}), 1);
        assertEquals(firstMissingPositive.firstMissingPositive(new int[]{}), 1);
        assertEquals(firstMissingPositive.firstMissingPositive(new int[]{1}), 2);
        assertEquals(firstMissingPositive.firstMissingPositive(new int[]{3, 4, -1, 1}), 2);
        assertEquals(firstMissingPositive.firstMissingPositive(new int[]{1, 2, 0}), 3);
        assertEquals(firstMissingPositive.firstMissingPositive(new int[]{7, 8, 9, 11, 12}), 1);

    }
}