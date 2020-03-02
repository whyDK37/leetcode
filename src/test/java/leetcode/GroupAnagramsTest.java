package leetcode;

import java.util.List;
import org.testng.annotations.Test;

public class GroupAnagramsTest {

  @Test
  public void testGroupAnagrams() {

    GroupAnagrams groupAnagrams = new GroupAnagrams();
    final List<List<String>> lists = groupAnagrams
        .groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    System.out.println(lists);
  }
}