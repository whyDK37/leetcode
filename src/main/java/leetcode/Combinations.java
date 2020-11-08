package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/combinations/
 */
public class Combinations {

  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> combs = new ArrayList<>();
    combine(combs, new ArrayList<>(), 1, n, k);
    return combs;
  }

  private void combine(List<List<Integer>> combs, ArrayList<Integer> integers,
      int cur, int n, int k) {
    // 裁剪
    if (integers.size() + (n - cur + 1) < k) {
      return;
    }
    if (integers.size() == k) {
      combs.add(new ArrayList<>(integers));
      return;
    }
    integers.add(cur);
    combine(combs, integers, cur + 1, n, k);
    integers.remove(integers.size() - 1);
    combine(combs, integers, cur + 1, n, k);

  }


}
