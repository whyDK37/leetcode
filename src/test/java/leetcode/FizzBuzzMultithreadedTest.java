package leetcode;

import org.testng.annotations.Test;

import java.util.function.IntConsumer;

import static org.testng.Assert.*;

public class FizzBuzzMultithreadedTest {

    @Test
    public void FizzBuzzMultithreaded() throws InterruptedException {
        final FizzBuzzMultithreaded.FizzBuzz fizzBuzz = new FizzBuzzMultithreaded.FizzBuzz(15);

        Thread num = new Thread(() -> {
            try {
                fizzBuzz.number(new IntConsumer() {
                    @Override
                    public void accept(int value) {
                        System.out.println(value + " ");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread fizz = new Thread(() -> {
            try {
                fizzBuzz.fizz(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("fizz ");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread buzz = new Thread(() -> {
            try {
                fizzBuzz.buzz(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("buzz ");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread fizzbuzz = new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("fizzbuzz ");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        num.setName("num");
        fizz.setName("fizz");
        buzz.setName("buzz");
        fizzbuzz.setName("fizzbuzz");
        num.start();
        fizz.start();
        buzz.start();
        fizzbuzz.start();

        num.join();
        fizz.join();
        buzz.join();
        fizzbuzz.join();
    }
}