package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ZigzagConversionTest {

  @Test
  public void testConvert() {
    ZigzagConversion conversion = new ZigzagConversion();
    Assert.assertEquals(conversion.convert("ab", 1), "ab");
    Assert.assertEquals(conversion.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
    Assert.assertEquals(conversion.convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
  }
}