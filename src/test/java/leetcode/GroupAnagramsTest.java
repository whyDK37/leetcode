package leetcode;

import org.testng.annotations.Test;

import java.util.List;

public class GroupAnagramsTest {

    @Test
    public void testGroupAnagrams() {

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        final List<List<String>> lists = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(lists);
    }
}