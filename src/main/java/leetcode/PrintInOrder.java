package leetcode;

import java.util.concurrent.CountDownLatch;

public class PrintInOrder {

  static class Foo {

    CountDownLatch first = new CountDownLatch(1);
    CountDownLatch second = new CountDownLatch(1);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

      // printFirst.run() outputs "first". Do not change or remove this line.
      printFirst.run();
      first.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
      first.await();
      // printSecond.run() outputs "second". Do not change or remove this line.
      printSecond.run();
      second.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
      first.await();
      second.await();
      // printThird.run() outputs "third". Do not change or remove this line.
      printThird.run();
    }
  }
}
