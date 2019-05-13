package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EditDistanceTest {

    @Test
    public void testMinDistance() {
        EditDistance editDistance = new EditDistance();
        assertEquals(editDistance.minDistance("horse", "ros"), 3);
        assertEquals(editDistance.minDistance("intention", "execution"), 5);
    }
}