package leetcode;


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {

  static class Solution {
    public int lengthOfLongestSubstring(String s) {
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

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.lengthOfLongestSubstring("tmmzuxt") == 5);
    System.out.println(solution.lengthOfLongestSubstring("pwwkew") == 3);
    System.out.println(solution.lengthOfLongestSubstring("abcabcbb") == 3);
    System.out.println(solution.lengthOfLongestSubstring("qrsvbspk") == 5);
    System.out.println(solution.lengthOfLongestSubstring("ynyo") == 3);
    System.out.println(solution.lengthOfLongestSubstring("anviaj") == 5);
    System.out.println(solution.lengthOfLongestSubstring("aab") == 2);
    System.out.println(solution.lengthOfLongestSubstring("bbbbb") == 1);
  }
}
