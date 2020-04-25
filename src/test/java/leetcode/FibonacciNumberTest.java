package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciNumberTest {

  @Test
  public void testFib() {
    FibonacciNumber fib = new FibonacciNumber();
    Assert.assertEquals(fib.fib(0), 0);
    Assert.assertEquals(fib.fib(1), 1);
    Assert.assertEquals(fib.fib(2), 1);
    Assert.assertEquals(fib.fib(3), 2);
    Assert.assertEquals(fib.fib(4), 3);
    Assert.assertEquals(fib.fib(5), 5);
    Assert.assertEquals(fib.fib(6), 8);
    Assert.assertEquals(fib.fib(7), 13);
    Assert.assertEquals(fib.fib(8), 21);
    Assert.assertEquals(fib.fib(9), 34);
  }
}