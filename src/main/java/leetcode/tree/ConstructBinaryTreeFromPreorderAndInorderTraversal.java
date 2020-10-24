package leetcode.tree;

import java.util.HashMap;
import java.util.Map;
import leetcode.pojo.TreeNode;

/**
 * 算法思想：分治 https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
 * 光头哥 https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/discuss/34543/Simple-O(n)-without-map
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

  public static void main(String[] args) {
    ConstructBinaryTreeFromPreorderAndInorderTraversal cons = new ConstructBinaryTreeFromPreorderAndInorderTraversal();


  }

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    // 防御性编程，判断两个数组长度是否相同

    // 初始化中序遍历的map
    Map<Integer, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
      indexMap.put(inorder[i], i);
    }
    // 构建递归函数
    return buildTree(preorder, 0, preorder.length - 1, indexMap, 0, inorder.length - 1);
  }

  private TreeNode buildTree(int[] preorder, int preLeft, int preRight,
      Map<Integer, Integer> inorderMap, int inLeft, int inRight) {
    // 递归终止条件
    if (preLeft > preRight || inLeft > inRight) {
      return null;
    }

    // 创建前序遍历的根节点
    TreeNode root = new TreeNode(preorder[preLeft]);

    int pIdx = inorderMap.get(preorder[preLeft]);

    // 找到左右子树的节点
    root.left = buildTree(preorder, preLeft + 1, pIdx - inLeft + preLeft,
        inorderMap, inLeft, pIdx - 1);
    root.right = buildTree(preorder, pIdx - inLeft + preLeft + 1, preRight,
        inorderMap, pIdx + 1, inRight);
    // 返回根节点
    return root;
  }
}
