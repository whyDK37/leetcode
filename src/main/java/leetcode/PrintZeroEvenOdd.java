package leetcode;


import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class PrintZeroEvenOdd {

  static class ZeroEvenOdd {

    private int n;
    private volatile int counter = 0;

    Semaphore zero = new Semaphore(1);
    Semaphore even = new Semaphore(0);
    Semaphore odd = new Semaphore(0);
    boolean endWithOdd;

    public ZeroEvenOdd(int n) {
      this.n = n;
      endWithOdd = n % 2 == 1;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
      for (int i = 0; i < n; i++) {
        zero.acquire();
        printNumber.accept(0);

        if (i % 2 == 0) {
          even.release();
        } else {
          odd.release();
        }
      }
    }

    // 偶数
    public void even(IntConsumer printNumber) throws InterruptedException {
      for (int i = 2; i < n; i += 2) {
        even.acquire();
        printNumber.accept(i);
        zero.release();
      }
    }

    // 奇数
    public void odd(IntConsumer printNumber) throws InterruptedException {
      for (int i = 1; i < n; i += 2) {
        odd.acquire();
        printNumber.accept(i);

        zero.release();
      }
    }
  }
}
