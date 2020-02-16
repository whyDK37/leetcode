package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class EditDistanceTest {

  @Test
  public void testMinDistance() {
    EditDistance editDistance = new EditDistance();
    assertEquals(editDistance.minDistance("horse", "ros"), 3);
    assertEquals(editDistance.minDistance("intention", "execution"), 5);
  }
}