package leetcode;

public class ImplementStrstr {
    /**
     * BR 暴力算法
     *
     * @return
     */
    public int BF(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        if (haystack == null || haystack.length() == 0) return -1;

        byte[] source = haystack.getBytes();
        byte[] target = needle.getBytes();
        int i = 0;
        while (i < source.length && (source.length - i) >= target.length) {
            int s = i;

            boolean match = true;
            for (int j = 0; j < target.length; j++) {
                if (source[s++] != target[j]) {
                    match = false;
                    break;
                }
            }
            if (match) return i;
            i++;
        }


        return -1;
    }
}
