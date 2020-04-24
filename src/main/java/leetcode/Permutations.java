package leetcode;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {

  public List<List<Integer>> permute(int[] nums, int start) {
    if (start == nums.length - 1) {
      return Collections.singletonList(Collections.singletonList(nums[start]));
    }

    List<List<Integer>> ret = new ArrayList<>();

    for (List<Integer> cur : permute(nums, start + 1)) {
      for (int i = 0; i <= cur.size(); ++i) {
        List<Integer> l = new ArrayList<>(cur);
        l.add(i, nums[start]);
        ret.add(l);
      }
    }

    return ret;
  }

  public List<List<Integer>> permute(int[] nums) {
    return permute(nums, 0);
  }
}
