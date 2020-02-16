package leetcode;

public class Test {

  public static void main(String[] args) {
    int i = 10;
    System.out.println(--i);
    System.out.println(sizeOfVarint(1));
    System.out.println(sizeOfVarint(0));
    System.out.println(sizeOfVarint(-1));
  }

  public static int sizeOfVarint(int value) {
    int v = (value << 1) ^ (value >> 31);
    int bytes = 1;
    while ((v & 0xffffff80) != 0L) {
      bytes += 1;
      v >>>= 7;
    }
    return bytes;
  }

}
