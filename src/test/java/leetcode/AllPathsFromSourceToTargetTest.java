package leetcode;

import org.testng.annotations.Test;

public class AllPathsFromSourceToTargetTest {

  @Test
  public void testLengthOfLongestSubstring() {
    System.out.println(AllPathsFromSourceToTarget.lengthOfLongestSubstring("anviaj") == 5);
    System.out.println(AllPathsFromSourceToTarget.lengthOfLongestSubstring("aab") == 2);
    System.out.println(AllPathsFromSourceToTarget.lengthOfLongestSubstring("abcabcbb") == 3);
    System.out.println(AllPathsFromSourceToTarget.lengthOfLongestSubstring("bbbbb") == 1);
    System.out.println(AllPathsFromSourceToTarget.lengthOfLongestSubstring("pwwkew") == 3);

  }
}