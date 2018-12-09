package leetcode;


public class MedianOfTwoSortedArrays {


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;

        int i = 0;
        int j = 0;
        boolean odd = ((m + n) & 1) == 1;
        int half = (m + n) / 2;
        while (true) {
            if ((i + j) == half) {
                break;
            }

            int right = right(nums1, i);
            int right2 = right(nums2, j);
            if (right > right2 && j < n) {
                j++;
            } else {
                i++;
            }
        }

        if (odd) {
            int right = right(nums1, i);
            int right2 = right(nums2, j);
            return right > right2 ? right2 : right;
        } else {
            double l = maxLeft(nums1, nums2, i, j);
            double r = minRight(nums1, nums2, i, j);
            return (l + r) / 2;
        }

    }

    public static int maxLeft(int[] nums1, int[] nums2, int i, int j) {
        int maxI = i > 0 ? nums1[i - 1] : Integer.MIN_VALUE;
        int maxJ = j > 0 ? nums2[j - 1] : Integer.MIN_VALUE;
        return maxI > maxJ ? maxI : maxJ;
    }

    public static int minRight(int[] nums1, int[] nums2, int i, int j) {
        int minI = (i == nums1.length) ? Integer.MAX_VALUE : nums1[i];
        int minJ = (j == nums2.length) ? Integer.MAX_VALUE : nums2[j];
        return minI > minJ ? minJ : minI;
    }


    public static int right(int[] nums, int index) {
        return (index == nums.length) ? Integer.MAX_VALUE : nums[index];
    }
}
