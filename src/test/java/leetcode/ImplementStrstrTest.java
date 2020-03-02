package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ImplementStrstrTest {

  @Test
  public void bf() {
    ImplementStrstr str = new ImplementStrstr();
    Assert.assertEquals(str.BF("aaaaaaaaaaaaaaaa", "baaa"), -1);
    Assert.assertEquals(str.BF("aaaaab", "ab"), 4);
    Assert.assertEquals(str.BF("hello", ""), 0);
    Assert.assertEquals(str.BF("hello", "ll"), 2);
    Assert.assertEquals(str.BF("aaaaa", "bba"), -1);
  }
}