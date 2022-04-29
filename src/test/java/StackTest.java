import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class StackTest {

  @Test
  public void test(){
    Stack stack = new Stack(3);
    stack.push(1);
    stack.push(1);
    stack.push(1);

    stack.pop();
    stack.pop();
    stack.pop();
  }
}