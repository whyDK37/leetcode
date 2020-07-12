package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ReverseBitsTest {

  @Test
  void testBit() {
    // HD, Figure 7-1
    int i = 1;
    System.out.println("0x55555555:" + Integer.toBinaryString(0x55555555));
    System.out.println("0x33333333:" + Integer.toBinaryString(0x33333333));
    System.out.println("0x33333333:" + Integer.toBinaryString(0x33333333));
    System.out.println("0x0f0f0f0f:" + Integer.toBinaryString(0x0f0f0f0f));
    System.out.println("0xff00:" + Integer.toBinaryString(0xff00));
    i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
    i = (i & 0x33333333) << 2 | (i >>> 2) & 0x33333333;
    i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
    i = (i << 24) | ((i & 0xff00) << 8) |
        ((i >>> 8) & 0xff00) | (i >>> 24);
    System.out.println(i);
  }

  @Test
  public void testReverseBits() {
    ReverseBits reverseBits = new ReverseBits();
    assertEquals(0b00111001011110000010100101000000,
        reverseBits.reverseBits(0b00000010_10010100_00011110_10011100));
  }
}