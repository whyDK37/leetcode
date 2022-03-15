package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 */
public class SerializeAndDeserializeBinaryTree {

  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    if (root == null) {
      return "X";
    }
    String l = "(" + serialize(root.left) + ")";
    String r = "(" + serialize(root.right) + ")";
    return l + root.val + r;
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    return null;
  }
}
