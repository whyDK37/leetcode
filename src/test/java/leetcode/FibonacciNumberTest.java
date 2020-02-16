package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciNumberTest {

  @Test
  public void testFib() {
    FibonacciNumber fib = new FibonacciNumber();
    Assert.assertEquals(fib.fib(2), 1);
    Assert.assertEquals(fib.fib(3), 2);
    Assert.assertEquals(fib.fib(4), 3);
  }
}