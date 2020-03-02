package leetcode.pojo;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
  }


  public TreeNode(int x, TreeNode left, TreeNode right) {
    val = x;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return "TreeNode{" +
        "val=" + val +
        ", left=" + left +
        ", right=" + right +
        '}';
  }
}