package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MajorityElementIITest {

  @Test
  public void testMajorityElement() {
    MajorityElementII elementII = new MajorityElementII();
    assertEquals(elementII.majorityElement(new int[0]).toString(), "[]");
    assertEquals(elementII.majorityElement(new int[]{2}).toString(), "[2]");
    assertEquals(elementII.majorityElement(new int[]{3, 2, 3}).toString(), "[3]");
    assertEquals(elementII.majorityElement(new int[]{1, 1, 1, 3, 3, 2, 2, 2}).toString(), "[1, 2]");
  }
}