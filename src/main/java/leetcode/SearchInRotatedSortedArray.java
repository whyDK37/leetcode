package leetcode;


/**
 * 1, find smallest index, using binary search is perfect. Smallest index separate nums into two
 * part, so the first half is always bigger the second half. 2, compare nums first item and target,
 * if target is bigger , search first half. else search second half. 3, Again, using binary search
 * to find target.
 */
public class SearchInRotatedSortedArray {

  public int search(int[] nums, int target) {
    if (nums.length == 0) {
      return -1;
    }

    // find smallest index
    int smallestIdx = findSmallestIndex(nums);
    int start = 0, end = nums.length - 1;
    if (nums[0] <= target) {
      end = smallestIdx;
    } else {
      start = smallestIdx;
    }

    // using binary search
    while (start <= end) {
      int m = (end - start) / 2 + start;
      if (nums[m] > target) {
        end = m - 1;
      } else if (nums[m] < target) {
        start = m + 1;
      } else {
        return m;
      }
    }

    return -1;
  }

  protected int findSmallestIndex(int[] nums) {
    int start = 0, end = nums.length - 1;
    while (end >= start) {
      int m = (end - start) / 2 + start;
      if (nums[m] > nums[end]) {
        start = m + 1;
      } else if (nums[m] < nums[end]) {
        end = m;
      } else {
        return m;
      }

    }

    return (start - end) / 2 + end;
  }
}
