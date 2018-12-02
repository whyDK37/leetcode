package leetcode;


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {

    public static int lengthOfLongestSubstring(String s) {
      int n = s.length();
      Map<Character, Integer> map = new HashMap<>();
      int ans = 0;
      for (int i = 0, j = 0; j < n; j++) {
        if (map.containsKey(s.charAt(j))) {
          i = Math.max(map.get(s.charAt(j)), i);
        }
        ans = Math.max(ans, j - i + 1);
        map.put(s.charAt(j), j + 1);
      }
      return ans;
    }
}
