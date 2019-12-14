package leetcode;

import org.testng.Assert;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class PrintFoobarAlternately {

    public static void main(String[] args) throws InterruptedException {
//        SynchronousQueue<Boolean> queue = new SynchronousQueue<>(true);
//        queue.put(Boolean.TRUE);

        int n = 2;
        for (int i = 0; i < 10; i++) {

            String rs = testN(i + 1);
            System.out.println(rs);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                sb.append("foobar");
            }

            Assert.assertEquals(rs, sb.toString());
        }
    }

    private static String testN(int n) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        final FooBar fooBar = new FooBar(n);
        Thread foo = new Thread(() -> {
            try {
                fooBar.foo(() -> sb.append("foo"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        foo.start();
        Thread bar = new Thread(() -> {
            try {
                fooBar.bar(() -> sb.append("bar"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        bar.start();

        foo.join();
        bar.join();
        return sb.toString();
    }

    static class FooBar {
        private int n;

        SynchronousQueue<Boolean> queue = new SynchronousQueue<>(true);

        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                // printFoo.run() outputs "foo". Do not change or remove this line.
                queue.take();
                printFoo.run();
                queue.put(Boolean.TRUE);
            }
            queue.take();
        }

        public void bar(Runnable printBar) throws InterruptedException {

            queue.put(Boolean.TRUE);

            for (int i = 0; i < n; i++) {
                // printBar.run() outputs "bar". Do not change or remove this line.
                queue.take();
                printBar.run();
                queue.put(Boolean.TRUE);
            }
        }
    }
}
