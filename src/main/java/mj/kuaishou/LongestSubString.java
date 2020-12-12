package mj.kuaishou;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LongestSubString {

  public static void main(String[] args) {
    System.out.println(longest2(new int[]{2, 2, 3, 4, 3, 2, 1}));
//    System.out.println(longest2(new int[]{2, 3, 4, 5}));
  }

  public static int longest(int[] ints) {
    if (ints == null || ints.length == 0) {
      return 0;
    }

    int max = 0;
    // 保存不同的数字
    List<Integer> nums = new LinkedList<>();
    for (int i = 0; i < ints.length; i++) {
      // 存在相同的数字，移除相同数字之前的所有数字
      if (nums.contains(ints[i])) {
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
          Integer next = iterator.next();
          if (next != ints[i]) {
            iterator.remove();
          } else {
            break;
          }
        }
        // 删除相同的数字，并添加到集合末尾
        iterator.remove();
        nums.add(ints[i]);
      } else {
        // 新的数字添加到集合中，并计算最大值
        nums.add(ints[i]);
        max = Math.max(max, nums.size());
      }
    }

    return max;
  }


  public static int longest2(int[] ints) {
    if (ints == null || ints.length == 0) {
      return 0;
    }

    int max = 0;
    int left = 0, right = 0;
    // 保存已经遍历的数字
    Set<Integer> visited = new HashSet<>();
    for (; right < ints.length; right++) {
      // 存在相同的数字，移除相同数字之前的所有数字
      if (visited.contains(ints[right])) {
        // 删除相同的数字之前的所有数字
        while (ints[left] != ints[right]) {
          visited.remove(ints[left]);
          left++;
        }
        left++;

      } else {
        // 新的数字添加到集合中，并计算最大值
        visited.add(ints[right]);
        max = Math.max(max, right - left + 1);
      }
    }

    return max;
  }
}
