package leetcode;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class FizzBuzzMultithreaded {
    static class FizzBuzz {
        private int n;

        Semaphore fizz = new Semaphore(0);
        Semaphore buzz = new Semaphore(0);
        Semaphore fizzbuzz = new Semaphore(0);
        Semaphore num = new Semaphore(1);

        public FizzBuzz(int n) {
            this.n = n;
        }

        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            int base = 3;
            for (int value = base, round = 1; value <= n; value = base * ++round) {
                if (value % 3 == 0 && value % 5 == 0) {
                    continue;
                }
                fizz.acquire();
                printFizz.run();
                num.release();
            }
        }

        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            int base = 5;
            for (int value = base, round = 1; value <= n; value = base * ++round) {
                if (value % 3 == 0 && value % 5 == 0) {
                    continue;
                }
                buzz.acquire();
                printBuzz.run();
                num.release();
            }
        }

        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            int base = 15;
            for (int value = base, round = 1; value <= n; value = base * ++round) {
                fizzbuzz.acquire();
                printFizzBuzz.run();
                num.release();
            }
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                num.acquire();
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzbuzz.release();
                } else if (i % 3 == 0) {
                    fizz.release();
                } else if (i % 5 == 0) {
                    buzz.release();
                } else {
                    printNumber.accept(i);
                    num.release();
                }
            }
        }
    }
}
