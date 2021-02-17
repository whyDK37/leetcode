package ali;

import java.util.Stack;

public class Queue {

  Stack<Integer> stack1 = new Stack<>();
  Stack<Integer> stack2 = new Stack<>();

  public static void main(String[] args) {
    Queue queue = new Queue();
    queue.push(1);
    System.out.println(queue.pop());
    queue.push(2);
    queue.push(3);
    System.out.println(queue.top());
    System.out.println(queue.pop());
    System.out.println(queue.top());
  }

  public void push(int num) {
    stack1.push(num);
  }

  public int top() {
    Integer re = null;
    if (!stack2.empty()) {
      re = stack2.pop();
    } else {
      while (!stack1.empty()) {
        re = stack1.pop();
        stack2.push(re);
      }
      if (!stack2.empty()) {
        re = stack2.peek();
      }
    }
    return re;
  }

  //出栈函数
  public int pop() {
    Integer re = null;
    if (!stack2.empty()) {
      re = stack2.pop();
    } else {
      while (!stack1.empty()) {
        re = stack1.pop();
        stack2.push(re);
      }
      if (!stack2.empty()) {
        re = stack2.pop();
      }
    }
    return re;
  }
}  