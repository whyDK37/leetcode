package leetcode;


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters4 {

    public static int lengthOfLongestSubstring(String s) {
      int max = 0, count = 0, i = 0, j = 0;
      // Hash map to maintain the position of each character we last saw
      Map<Character, Integer> map = new HashMap<>();

      while (i < s.length()) {
        char c = s.charAt(i);
        if (!map.containsKey(c)) {
          count++;
          map.put(c, i);
          if (count > max) {
            max = count;
          }
          i++;
        } else {
          if (j < s.length()) {
            j++;
            i = j;
            count = 0;
            map.clear();
          }
        }

      }
      return max;
    }
}
