package leetcode;

import java.util.concurrent.Semaphore;

public class BuildingH2o {
    static class H2O {

        Semaphore h = new Semaphore(2);
        Semaphore o = new Semaphore(0);
        int n = 0;

        public H2O() {

        }

        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
            h.acquire();
            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();
            if (++n == 2) {
                n = 0;
                o.release();
            }
        }

        public void oxygen(Runnable releaseOxygen) throws InterruptedException {
            o.acquire();
            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
            h.release(2);
        }
    }
}
