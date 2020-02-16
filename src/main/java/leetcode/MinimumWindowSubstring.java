package leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.util.Pair;

public class MinimumWindowSubstring {

  public String minWindow(String s, String t) {
    if (s.length() == 0 || t.length() == 0 || t.length() > s.length()) {
      return "";
    }

    Map<Character, Integer> dictT = new HashMap<>();

    for (int i = 0; i < t.length(); i++) {
      int count = dictT.getOrDefault(t.charAt(i), 0);
      dictT.put(t.charAt(i), count + 1);
    }

    int required = dictT.size();

    // Filter all the characters from s into a new list along with their index.
    // The filtering criteria is that the character should be present in t.
    List<Pair<Integer, Character>> filteredS = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (dictT.containsKey(c)) {
        filteredS.add(new Pair<>(i, c));
      }
    }

    int left = 0, right = 0, formed = 0;
    Map<Character, Integer> windowCounts = new HashMap<>();
    int[] ans = {-1, 0, 0};

    // Look for the characters only in the filtered list instead of entire s.
    // This helps to reduce our search.
    // Hence, we follow the sliding window approach on as small list.
    while (right < filteredS.size()) {
      char c = filteredS.get(right).getValue();
      int count = windowCounts.getOrDefault(c, 0);
      windowCounts.put(c, count + 1);

      if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
        formed++;
      }

      // Try and contract the window till the point where it ceases to be 'desirable'.
      while (left <= right && formed == required) {
        c = filteredS.get(left).getValue();

        // Save the smallest window until now.
        int end = filteredS.get(right).getKey();
        int start = filteredS.get(left).getKey();
        if (ans[0] == -1 || end - start + 1 < ans[0]) {
          ans[0] = end - start + 1;
          ans[1] = start;
          ans[2] = end;
        }

        windowCounts.put(c, windowCounts.get(c) - 1);
        if (dictT.containsKey(c) && windowCounts.get(c) < dictT.get(c)) {
          formed--;
        }
        left++;
      }
      right++;
    }
    return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
  }
}
