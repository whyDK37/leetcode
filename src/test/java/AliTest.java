public class AliTest {

  static int x = 10;

  static {
    x += 5;
  }

  public static void main(String[] args) {
    int i = 0;
    System.out.println(i++);
    char a = (char) i;
    i = a;
    int[] arr = new int[12];
    System.out.println(arr[2]);
    System.out.println(x);
  }

  static {
    x += 3;
  }

}
