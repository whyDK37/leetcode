package leetcode;

import org.testng.annotations.Test;

public class TheDiningPhilosophersTest {

  @Test
  public void TheDiningPhilosophers() throws InterruptedException {
    TheDiningPhilosophers.DiningPhilosophers diningPhilosophers = new TheDiningPhilosophers.DiningPhilosophers();

    Thread one = newPh(diningPhilosophers, 0);
    Thread two = newPh(diningPhilosophers, 1);
    Thread three = newPh(diningPhilosophers, 2);
    Thread four = newPh(diningPhilosophers, 3);
    Thread five = newPh(diningPhilosophers, 4);

    one.setName("one");
    two.setName("two");
    three.setName("three");
    four.setName("four");
    five.setName("five");

    one.start();
    two.start();
    three.start();
    four.start();
    five.start();

    one.join();
    two.join();
    three.join();
    four.join();
    five.join();


  }

  private Thread newPh(TheDiningPhilosophers.DiningPhilosophers diningPhilosophers,
      int philosopher) {
    return new Thread(() -> {
      try {
        diningPhilosophers.wantsToEat(philosopher,
            () -> {
              System.out.println(philosopher + " pickLeft");
            },
            () -> {
              System.out.println(philosopher + " pickRight");
            },
            () -> {
              System.out.println(philosopher + " eat");
            },
            () -> {
              System.out.println(philosopher + " putLeft");
            },
            () -> {
              System.out.println(philosopher + " putRight");
            }
        );
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
  }

}