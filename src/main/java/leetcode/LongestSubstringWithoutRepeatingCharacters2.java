package leetcode;


import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters2 {

  static class Solution {
    public int lengthOfLongestSubstring(String s)  {
      int n = s.length();
      Set<Character> set = new HashSet<>();
      int ans = 0, i = 0, j = 0;
      while (i < n && j < n) {
        // try to extend the range [i, j]
        if (!set.contains(s.charAt(j))){
          set.add(s.charAt(j++));
          ans = Math.max(ans, j - i);
        }
        else {
          set.remove(s.charAt(i++));
        }
      }
      return ans;
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
  }
}
