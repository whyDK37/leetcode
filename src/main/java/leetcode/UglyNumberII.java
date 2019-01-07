package leetcode;

public class UglyNumberII {
    public int nthUglyNumber(int index) {
        if (index < 1) return 0;
        if (index == 1) return 1;

        int[] uglyArr = new int[index];
        uglyArr[0] = 1;
        int uglyNextIndex = 1;

        int ugly2 = 0;
        int ugly3 = 0;
        int ugly5 = 0;

        while (uglyNextIndex < index) {
            int min = min(uglyArr[ugly2] * 2, uglyArr[ugly3] * 3, uglyArr[ugly5] * 5);
            uglyArr[uglyNextIndex] = min;

            while (uglyArr[ugly2] * 2 <= uglyArr[uglyNextIndex]) {
                ugly2++;
            }
            while (uglyArr[ugly3] * 3 <= uglyArr[uglyNextIndex]) {
                ugly3++;
            }
            while (uglyArr[ugly5] * 5 <= uglyArr[uglyNextIndex]) {
                ugly5++;
            }
            uglyNextIndex++;
        }

        return uglyArr[uglyNextIndex - 1];

    }

    private int min(int num1, int num2, int num3) {
        return Math.min((num1 <= num2) ? num1 : num2, num3);
    }
}
