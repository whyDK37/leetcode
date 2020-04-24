package alg.recursion;

/**
 * 递归的本质是调用栈结构，但调用方法返回就是出栈并返回结果。
 * <p>
 * 回溯的本质是在右分支条件的请情况下，保留某个数据状态， 等待一种情况处理完成并返回是，再处理下一个情况，直到处理完成。 使用回溯的情况必定是有多条件判断的处理。
 * <p>
 * 递归和回溯结合使用，回溯会使用递归调用栈保存回溯点，当递归调用完成返回， 会触发回溯点的条件继续处理其他情况。
 */
public class Maze2 {

  /**
   * 1 墙 2 通路 3 不通
   *
   * @param args
   */
  public static void main(String[] args) {
    // 目前只支持矩形迷宫
    int[][] mg = buildMG(new String[]{
        "1,1,1,1,1,1,1,1,1,1",
        "1,0,0,1,0,0,0,0,0,1",
        "1,0,1,1,0,1,0,0,0,1",
        "1,0,0,0,0,1,0,0,0,1",
        "1,1,1,1,1,1,0,0,0,1",
        "1,0,0,0,0,0,0,0,0,1",
        "1,0,0,0,0,0,0,0,0,1",
        "1,0,0,0,0,0,0,0,0,1",
        "1,0,0,0,0,0,0,0,0,1",
        "1,1,1,1,1,1,1,1,1,1"
    });

    pintMG(mg);

    findPath(mg, 1, 1);
    System.out.println("---------------------");
    pintMG(mg);
  }

  static boolean findPath(int[][] mg, int i, int j) {
    if (mg[mg.length - 2][mg.length - 2] == 2) {
      return true;
    }
    if (mg[i][j] == 0) {
      // 右，下，左，上
      mg[i][j] = 2;
      if (findPath(mg, i, j + 1) ||
          findPath(mg, i + 1, j) ||
          findPath(mg, i, j - 1) ||
          findPath(mg, i - 1, j)) {
        return true;
      } else {
        mg[i][j] = 3;
        return false;
      }
    }
    return false;
  }

  private static int[][] buildMG(String[] lines) {
    int[][] mg = new int[lines.length][];
    for (int row = 0; row < lines.length; row++) {
      String[] split = lines[row].split("[,]");
      mg[row] = new int[split.length];
      for (int column = 0; column < split.length; column++) {
        mg[row][column] = Integer.parseInt(split[column]);
      }
    }
    return mg;
  }

  private static void pintMG(int[][] mg) {
    for (int[] ints : mg) {
      for (int anInt : ints) {
        System.out.print(anInt + " ");
      }
      System.out.println();
    }
  }
}
