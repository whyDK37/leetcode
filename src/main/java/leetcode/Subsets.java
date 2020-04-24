package leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * Idea, inside the recursive method, when we are facing the ith number in the nums array, we have
 * two cases, one is add the number into the current list, the other is not add it. After making
 * each case, moving the index one step further.
 */
public class Subsets {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    subsets(nums, 0, current, result);
    return result;
  }

  private void subsets(int[] nums, int i, List<Integer> current, List<List<Integer>> result) {
    if (i == nums.length) {
      List<Integer> tmp = new ArrayList<>(current);
      result.add(tmp);
    } else {
      current.add(nums[i]);
      subsets(nums, i + 1, current, result);
      current.remove(current.size() - 1);
      subsets(nums, i + 1, current, result);
    }
  }
}
