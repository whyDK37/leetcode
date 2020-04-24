package leetcode;

import org.testng.Assert;

/**
 * @author why
 */
public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    String pre = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (!strs[i].startsWith(pre)) {
        pre = pre.substring(0, pre.length() - 1);
        if ("".equals(pre)) {
          return pre;
        }
      }
    }
    return pre;
  }

  public static void main(String[] args) {
    LongestCommonPrefix prefix = new LongestCommonPrefix();
    Assert.assertEquals(prefix.longestCommonPrefix(new String[]{"hello", "hello"}), "hello");
    Assert.assertEquals(prefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl");
    Assert.assertEquals(prefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}), "");
  }
}
