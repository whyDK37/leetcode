package leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SubsetsII {

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Map<List<Integer>, List<Integer>> result = new HashMap<>();
    List<Integer> current = new ArrayList<>();
    // first sort
    quickSort(0, nums.length - 1, nums);
    subsets(nums, 0, current, result);
    return new ArrayList<>(result.values());
  }

  private void quickSort(int s, int e, int[] nums) {

    if (s >= e) {
      return;
    }

    int p = part(s, e, nums);
    quickSort(s, p - 1, nums);
    quickSort(p + 1, e, nums);

  }

  private int part(int s, int e, int[] nums) {
    int pivot = nums[e];
    int i = s;
    for (int j = s; j < e; j++) {
      if (pivot > nums[j]) {
        swap(nums, i, j);
        i++;
      }
    }

    swap(nums, i, e);

    return i;
  }

  public void swap(int[] nums, int i, int j) {
    if (i == j) {
      return;
    }
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }

  private void subsets(int[] nums, int i, List<Integer> current,
      Map<List<Integer>, List<Integer>> result) {
    if (i == nums.length) {
      List<Integer> tmp = new ArrayList<>(current);
      result.put(tmp, tmp);
    } else {
      current.add(nums[i]);
      subsets(nums, i + 1, current, result);
      current.remove(current.size() - 1);
      subsets(nums, i + 1, current, result);
    }
  }
}
