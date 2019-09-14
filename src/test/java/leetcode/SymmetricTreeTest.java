package leetcode;

import leetcode.util.TestUtil;

import static org.testng.Assert.*;

public class SymmetricTreeTest {

    @org.testng.annotations.Test
    public void testIsSymmetric() {
        SymmetricTree symmetricTree = new SymmetricTree();
        assertTrue(symmetricTree.isSymmetric(TestUtil.buildTree(new Integer[]{1, 2, 2, 3, 4, 4, 3})));
        assertFalse(symmetricTree.isSymmetric(TestUtil.buildTree(new Integer[]{1, 2, 2, null, 3, null, 3})));
    }
}