package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MajorityElementTest {

  @Test
  public void testMajorityElement() {
    MajorityElement majorityElement = new MajorityElement();
    assertEquals(majorityElement.majorityElement(new int[]{3, 2, 3}), 3);
    assertEquals(majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}), 2);
  }
}