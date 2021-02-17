package ali;

public class ThreadPrintMain {

  final int threadNum;
  private final int sum;
  private volatile int i = 0;
  private Thread[] threads;
  private volatile int flag = 0;

  public ThreadPrintMain(int threadNum, int sum) {
    this.threadNum = threadNum;
    this.sum = sum;
  }

  public static void main(String[] args) throws InterruptedException {
    ThreadPrintMain threadPrint = new ThreadPrintMain(5, 100);
    threadPrint.runThread();
  }

  public void runThread() throws InterruptedException {
    threads = new Thread[threadNum];
    for (int j = 0; j < threadNum; j++) {
      threads[j] = new Thread(new PrintThread(j));
      threads[j].setName("thread" + (j + 1));
    }
    for (Thread thread : threads) {
      thread.start();
    }
  }

  public class PrintThread implements Runnable {

    int num = 0;

    public PrintThread(int num) {
      this.num = num;
    }

    public void run() {
      while (i < sum) {
        if (flag == num) {
          System.out.println(Thread.currentThread().getName() + ":" + (++i));
          flag = (num + 1) == threadNum ? 0 : num + 1;
        }
      }
    }

  }

}
