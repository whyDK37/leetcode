package leetcode;

/**
 * https://articles.leetcode.com/longest-palindromic-substring-part-i/
 * An O(N) Solution (Manacher’s Algorithm):
 * https://articles.leetcode.com/longest-palindromic-substring-part-ii/
 */
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return null;

        char[] chars = s.toCharArray();
        char[] T = new char[chars.length * 2 + 1];
        int[] P = new int[T.length];
        int indexT = 0;
        T[indexT++] = '#';
        for (char aChar : chars) {
            T[indexT++] = aChar;
            T[indexT++] = '#';
        }

        System.out.println(T);
        System.out.println(P);

        int indexP = 0;
        P[indexP++] = 0;
        // if P[ i’ ] ≤ R – i,
        //   then P[ i ] ← P[ i’ ]
        // else P[ i ] ≥ P[ i’ ]. (Which we have to expand past the right edge (R) to find P[ i ].
        int i = 0;
        int R = 2;
        int c = 1;
        while (R < T.length) {
            i++;
            if (P[c - i] <= (R - i)) {
                P[i] = P[c - i];
                indexP++;
            } else {
                P[i] = calcP(T, i);
                c = R;
                i = 0;
            }
            R++;
        }

        return null;
    }

    private static int calcP(char[] T, int center) {
        int num = 0;
        while (T.length > center + num && center - num > 0) {
            num++;
            if (T[center + num] != T[center - num]) break;
        }
        return num;
    }
}
