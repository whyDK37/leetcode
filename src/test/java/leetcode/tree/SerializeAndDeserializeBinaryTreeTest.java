package leetcode.tree;

import leetcode.util.TestUtil;
import org.testng.annotations.Test;

public class SerializeAndDeserializeBinaryTreeTest {

  @Test
  public void test() {
    // Your Codec object will be instantiated and called as such:
    SerializeAndDeserializeBinaryTree codec = new SerializeAndDeserializeBinaryTree();

    System.out.println(codec.serialize(TestUtil.buildTree(new Integer[]{1, null, 2})));
    codec.deserialize(codec.serialize(TestUtil.buildTree(new Integer[]{1, null, 2})));
  }

}