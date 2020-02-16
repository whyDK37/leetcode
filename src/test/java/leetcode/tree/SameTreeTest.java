package leetcode.tree;

import leetcode.util.TestUtil;
import org.testng.Assert;


public class SameTreeTest {

  public static void main(String[] args) {
    SameTree sameTree = new SameTree();
    Assert.assertTrue(sameTree.isSameTree(TestUtil.buildTree(new Integer[]{1, 2, 3}),
        TestUtil.buildTree(new Integer[]{1, 2, 3})));
  }
}