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

  @Test
  public void testMajorityElement_v2() {
    MajorityElementII_v2 elementII = new MajorityElementII_v2();

    assertEquals(elementII.majorityElementN(new int[]{3, 2, 3}, 1).toString(), "[3]");
    assertEquals(elementII.majorityElementN(new int[]{2, 2, 1, 1, 1, 2, 2}, 1).toString(), "[2]");
    System.out.println(elementII.majorityElementN(new int[]{1, 2, 1, 2, 1}, 1));
    System.out.println(elementII.majorityElementN(new int[]{1, 2, 2, 1, 1}, 1));


    assertEquals(elementII.majorityElement(new int[]{2}).toString(), "[2]");
    assertEquals(elementII.majorityElement(new int[]{1, 1, 1, 3, 3, 2, 2, 2}).toString(), "[1, 2]");
    assertEquals(elementII.majorityElement(new int[0]).toString(), "[]");
    assertEquals(elementII.majorityElement(new int[]{3, 2, 3}).toString(), "[3]");

  }
}