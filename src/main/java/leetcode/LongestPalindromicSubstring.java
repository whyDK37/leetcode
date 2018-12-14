package leetcode;

import java.util.Arrays;

/**
 * https://articles.leetcode.com/longest-palindromic-substring-part-i/
 * An O(N) Solution (Manacher’s Algorithm):
 * https://articles.leetcode.com/longest-palindromic-substring-part-ii/
 */
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) return s;

        char[] chars = s.toCharArray();
        char[] T = new char[chars.length * 2 + 1];
        int[] P = new int[T.length];
        int indexT = 0;
        T[indexT++] = '#';
        for (char aChar : chars) {
            T[indexT++] = aChar;
            T[indexT++] = '#';
        }

//        System.out.println(Arrays.toString(T));

        // if P[ i’ ] ≤ R – i,
        //   then P[ i ] ← P[ i’ ]
        // else P[ i ] ≥ P[ i’ ]. (Which we have to expand past the right edge (R) to find P[ i ].
        int R = 0;
        int c = 0;
        for (int i = 1; i < T.length; i++) {
            int i_mirror = 2 * c - i;// equals to i' = C - (i-C)

            if (i_mirror >= 0 && P[i_mirror] < R - i) {
                P[i] = P[i_mirror];
            } else {
                P[i] = calcP(T, i);
            }

            if (i + P[i] > R) {
                c = i;
                R = i + P[i];
            }
        }
//        System.out.println(Arrays.toString(P));

        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < T.length; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }

        int beginIndex = (centerIndex - maxLen) / 2;
        return s.substring(beginIndex, beginIndex + maxLen);
    }

    static int calcP(char[] T, int center) {
        int num = 1;
        while (T.length > center + num && center - num >= 0) {
            if (T[center + num] != T[center - num]) break;
            num++;
        }
        return num - 1;
    }
}
