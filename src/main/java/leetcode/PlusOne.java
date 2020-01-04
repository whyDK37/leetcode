package leetcode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        int[] rs = new int[digits.length + 1];
//        System.arraycopy(digits, 0, rs, 1, digits.length);
        rs[0] = 1;
        return rs;
    }
}
