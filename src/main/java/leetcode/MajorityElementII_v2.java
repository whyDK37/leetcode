package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 229. 求众数 II https://leetcode-cn.com/problems/majority-element-II/description/
 * <p>
 * 摩尔投票法 https://leetcode-cn.com/problems/majority-element-ii/solution/liang-fu-dong-hua-yan-shi-mo-er-tou-piao-fa-zui-zh/
 */
public class MajorityElementII_v2 {

  public List<Integer> majorityElement(int[] nums) {
    // 创建返回值
    int candidateNum = 2;
    return majorityElementN(nums, candidateNum);
  }

  protected List<Integer> majorityElementN(int[] nums, int candidateNum) {
    List<Integer> res = new ArrayList<>(candidateNum);
    if (nums == null || nums.length == 0) {
      return res;
    }
    // 初始化两个候选人candidate，和他们的计票
    int[] candArr = new int[candidateNum];
    Arrays.fill(candArr, nums[0]);
    int[] candCount = new int[candidateNum];

    // 摩尔投票法，分为两个阶段：配对阶段和计数阶段
    // 配对阶段
    for (int num : nums) {
      boolean skip = false;
      for (int i = 0; i < candArr.length; i++) {
        if (candArr[i] == num) {
          candCount[i]++;
          skip = true;
          break;
        }
      }
      if (skip) {
        continue;
      }

      for (int j = 0; j < candArr.length; j++) {
        if (candCount[j] == 0) {
          candArr[j] = num;
          candCount[j] = 1;
          skip = true;
          break;
        }
      }
      if (skip) {
        continue;
      }

      for (int k = 0; k < candCount.length; k++) {
        candCount[k]--;
      }
    }

    // 计数阶段
    // 找到了两个候选人之后，需要确定票数是否满足大于 N/3
    int[] count = new int[candidateNum];
    for (int num : nums) {
      for (int i = 0; i < candArr.length; i++) {
        if (candArr[i] == num) {
          count[i]++;
          break;
        }
      }
    }

    for (int i = 0; i < count.length; i++) {
      if (count[i] > nums.length / 3) {
        res.add(candArr[i]);
      }
    }

    return res;
  }
}
