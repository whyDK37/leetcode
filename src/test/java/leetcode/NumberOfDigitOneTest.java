package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NumberOfDigitOneTest {

  @Test
  public void countDigitOne() {
    NumberOfDigitOne numberOfDigitOne = new NumberOfDigitOne();
    assertEquals(numberOfDigitOne.countDigitOne(13), 6);
  }
}