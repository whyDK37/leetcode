package leetcode.tree;

import leetcode.pojo.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateBinarySearchTreeTest {

  @Test
  public void isValid() {
    ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

    Assert.assertFalse(validateBinarySearchTree.isValidBST(new TreeNode(24,
        new TreeNode(-60,
            new TreeNode(-60),
            new TreeNode(-6)), null)));
    Assert.assertFalse(validateBinarySearchTree.isValidBST(new TreeNode(0,
        null, new TreeNode(-1))));
    Assert.assertTrue(validateBinarySearchTree.isValidBST(new TreeNode(-2147483648,
        null, new TreeNode(2147483647))));
    Assert.assertTrue(validateBinarySearchTree.isValidBST(new TreeNode(2,
        new TreeNode(1), new TreeNode(3))));
    Assert.assertFalse(validateBinarySearchTree.isValidBST(new TreeNode(1,
        new TreeNode(1), null)));
  }

}