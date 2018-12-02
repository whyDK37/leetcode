package leetcode;


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Boolean> booleanMap = new HashMap<>();
        char[] chars = s.toCharArray();
        int length = 0;
        for (int i = 0; i < chars.length; i++) {
            booleanMap.put(chars[i], Boolean.TRUE);
            for (int j = i + 1; j < chars.length; j++) {
                if (booleanMap.containsKey(chars[j])) {
                    break;
                } else {
                    booleanMap.put(chars[j], Boolean.TRUE);
                }
            }
            length = length > booleanMap.size() ? length : booleanMap.size();
            if (length == (chars.length - i)) break;
            booleanMap.clear();
        }
        return length;
    }
}
