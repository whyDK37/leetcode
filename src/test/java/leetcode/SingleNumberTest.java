package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SingleNumberTest {

  @Test
  public void testSingleNumber() {
    SingleNumber singleNumber = new SingleNumber();
    assertEquals(singleNumber.singleNumber(new int[]{2, 2, 1}), 1);
//    assertEquals(singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}), 4);
  }
}