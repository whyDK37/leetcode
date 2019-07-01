package leetcode;


public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || t.length() > s.length()) return "";

        char[] souorce = s.toCharArray();
        char[] target = t.toCharArray();
        int left = 0, right = 0;

        return null;
    }
}
