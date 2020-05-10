package leetcode;

public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    if (t == null && s == null) {
      return true;
    }
    if (s == null) {
      return false;
    }
    if (t == null) {
      return false;
    }
    if (s.length() != t.length()) {
      return false;
    }

    // 第一遍累加
    int[] arr = new int[26];
    for (char c : s.toCharArray()) {
      arr[c - 'a']++;
    }
    // 第二遍
    for (char c : t.toCharArray()) {
      arr[c - 'a']--;
      if (arr[c - 'a'] < 0) {
        return false;
      }
    }

    return true;
  }
}
