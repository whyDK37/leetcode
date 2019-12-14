package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PrintInOrderTest {

    @Test
    public void printInOrderTest() throws InterruptedException {
        PrintInOrder.Foo foo = new PrintInOrder.Foo();

        Thread first = new Thread(() -> System.out.println("first"));
        Thread second = new Thread(() -> System.out.println("second"));
        Thread third = new Thread(() -> System.out.println("third"));
        foo.first(first);
        foo.second(second);
        foo.third(third);
    }
}