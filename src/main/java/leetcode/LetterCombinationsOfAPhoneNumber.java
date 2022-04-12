package leetcode;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 17 https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
public class LetterCombinationsOfAPhoneNumber {

  private final String[] LETTERS = new String[]{"", "",
      "abc",
      "def",
      "ghi",
      "jkl",
      "mno",
      "pqrs",
      "tuv",
      "wxyz"};

  public List<String> letterCombinations(String digits) {
    if (digits == null || digits.length() == 0) {
      return Collections.emptyList();
    }

    char[] chars = digits.toCharArray();
    String[] letter = new String[chars.length];

    // 数字对应的字母数组
    for (int i = 0; i < chars.length; i++) {
      letter[i] = LETTERS[chars[i] - 48];
    }

    List<String> result = new ArrayList<>();

    buildCombination(result, letter, "", 0);

    return result;
  }

  private void buildCombination(List<String> result, String[] letter, String pre, int index) {
    // 终止条件，当最后一层时，把最后一个电话号码以此拼接 pre 即可
    if (letter.length == index + 1) {
      String s = letter[index];
      for (char c : s.toCharArray()) {
        result.add(pre + c);
      }
      return;
    }

    String s = letter[index];
    for (char c : s.toCharArray()) {
      buildCombination(result, letter, pre + c, index + 1);
    }
  }
}
