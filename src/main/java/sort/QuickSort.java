package sort;

import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    QuickSort quickSort = new QuickSort();
    int[] arrays = {2, 5, 3, 4, 6, 1};
    System.out.println(Arrays.toString(arrays));
    quickSort.quickSort(arrays, 0, arrays.length - 1);
  }

  public int partition(int[] arrays, int left, int right) {
    int pivat = arrays[left];
    System.out.println("挖第一个数这个坑\t" + pivat);
    while (left < right) {
      // 从右往左找比pivat小的数，没找到则跳过
      while (left < right && arrays[right] >= pivat) {
        System.out.println("大，看看我左边");
        right--;
      }
      // 找到了就把右边的数放到左边去
      if (left < right) {
        System.out.println("小，移位");
        arrays[left] = arrays[right];
        System.out.println("现在状态\t" + Arrays.toString(arrays));
        left++;
      }
      // 从左往右找比pivat大的数，没找到则跳过
      while (left < right && arrays[left] < pivat) {
        System.out.println("小，看看我右边");
        left++;
      }
      // 找到的了就把左边的数放到右边去
      if (left < right) {
        System.out.println("大，移位");
        arrays[right] = arrays[left];
        System.out.println("现在状态\t" + Arrays.toString(arrays));
        right--;
      }
    }
    // 最后剩下的坑位放pivat
    arrays[left] = pivat;
    System.err.println("完成\t" + Arrays.toString(arrays));
    return left;
  }

  public void quickSort(int[] arrays, int left, int right) {
    if (left < right) {
      int index = this.partition(arrays, left, right);
      quickSort(arrays, left, index - 1);
      quickSort(arrays, index + 1, right);
    }
  }

}