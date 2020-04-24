package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {


  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> resultMap = new HashMap<>();

    for (String str : strs) {

      byte[] byteArr = str.getBytes();
      Arrays.sort(byteArr);
      String key = new String(byteArr);

      resultMap.putIfAbsent(key, new LinkedList<>());
      resultMap.get(key).add(str);
    }

    return new LinkedList<>(resultMap.values());
  }
}
