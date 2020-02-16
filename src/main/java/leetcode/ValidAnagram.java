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

    int[] arr = new int[26];
    for (char c : s.toCharArray()) {
      arr[c - 'a']++;
    }
    for (char c : t.toCharArray()) {
      if (arr[c - 'a'] == 0) {
        return false;
      }
      arr[c - 'a']--;
    }

    return true;
  }
}
