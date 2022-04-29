import java.util.concurrent.LinkedBlockingDeque;

/**
 * 这是示例题目的代码 请使用console.log或者process.stdout.write函数输出运算结果
 * <p>
 * 1、设计无锁Stack，包含push和pop方法。
 */

public class Stack {

  private final LinkedBlockingDeque<Integer> deque;

  public Stack(int size) {
    deque = new LinkedBlockingDeque<>(size);
  }

  public void push(int i) {
    deque.push(i);
  }

  public int pop() {
    return deque.pop();
  }
}