package leetcode;


import org.testng.Assert;
import org.testng.annotations.Test;

public class LRUCacheTest {

  @Test
  public void test() {
    LRUCache cache = new LRUCache(2 /* capacity */);

    cache.put(1, 1);
    cache.put(2, 2);
    Assert.assertEquals(cache.get(1), 1);       // returns 1
    cache.put(3, 3);    // evicts key 2
    Assert.assertEquals(cache.get(2), -1);       // returns -1 (not found)
    cache.put(4, 4);    // evicts key 1
    Assert.assertEquals(cache.get(1), -1);       // returns -1 (not found)
    cache.get(3);       // returns 3
    cache.get(4);       // returns 4
  }

}