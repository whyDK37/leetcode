package leetcode;


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters4 {

  static class Solution {
    public int lengthOfLongestSubstring(String s) {
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

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.lengthOfLongestSubstring("pwwkew") == 3);
    System.out.println(solution.lengthOfLongestSubstring("abcabcbb") == 3);
    System.out.println(solution.lengthOfLongestSubstring("qrsvbspk") == 5);
    System.out.println(solution.lengthOfLongestSubstring("ynyo") == 3);
    System.out.println(solution.lengthOfLongestSubstring("anviaj") == 5);
    System.out.println(solution.lengthOfLongestSubstring("aab") == 2);
    System.out.println(solution.lengthOfLongestSubstring("bbbbb") == 1);
    System.out.println(solution.lengthOfLongestSubstring("tmmzuxt") == 5);
  }
}
