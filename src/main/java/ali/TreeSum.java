package ali;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import leetcode.pojo.TreeNode;

public class TreeSum {

  public static void main(String[] args) {
    TreeSum sum = new TreeSum();
    List<List<Integer>> lists = sum.pathSum(new TreeNode(1
        , new TreeNode(2, new TreeNode(2), new TreeNode(3)), new TreeNode(4)), 5);

    for (List<Integer> list : lists) {
      System.out.println(list);
    }
  }

  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    if (root == null) {
      return Collections.emptyList();
    }

    List<List<Integer>> result = new ArrayList<>();
    dfs(result, root, new ArrayList<>(), 0, sum);
    return result;
  }

  private void dfs(List<List<Integer>> result, TreeNode root, List<Integer> res, int pathSum,
      int sum) {
    if (pathSum == sum && root == null) {
      result.add(res);
      return;
    }
    if (root == null) {
      return;
    }

    ArrayList<Integer> nextLevel = new ArrayList<>(res);
    nextLevel.add(root.val);

    if (root.left == null && root.right == null) {
      dfs(result, root.left, nextLevel, pathSum + root.val, sum);
    } else {
      dfs(result, root.left, nextLevel, pathSum + root.val, sum);
      dfs(result, root.right, nextLevel, pathSum + root.val, sum);
    }
  }
}
