package leetcode;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;

public class ImplementTriePrefixTreeTest {

  @Test
  public void test() {
    ImplementTriePrefixTree.Trie trie = new ImplementTriePrefixTree.Trie();

    trie.insert("apple");
    assertTrue(trie.search("apple"));   // 返回 True
    assertFalse(trie.search("app"));     // 返回 False
    assertTrue(trie.startsWith("app")); // 返回 True
    trie.insert("app");
    assertTrue(trie.search("app"));     // 返回 True

  }
}