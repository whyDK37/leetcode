package leetcode.tree;

import org.testng.Assert;
import leetcode.util.TestUtil;


public class SameTreeTest {
    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
        Assert.assertTrue(sameTree.isSameTree(TestUtil.buildTree(new Integer[]{1, 2, 3}),
                TestUtil.buildTree(new Integer[]{1, 2, 3})));
    }
}