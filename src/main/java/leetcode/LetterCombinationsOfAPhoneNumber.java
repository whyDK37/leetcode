package leetcode;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    private String[] LETTERS = new String[]{"", "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return Collections.EMPTY_LIST;

        char[] chars = digits.toCharArray();
        String[] letter = new String[chars.length];
        int size = 1;
        for (int i = 0; i < chars.length; i++) {
            letter[i] = LETTERS[chars[i] - 48];
            size *= letter[i].length();
        }

        List<String> result = new ArrayList<>(size);

        buildCombination(result, letter, "", 0);

        return result;
    }

    private void buildCombination(List<String> result, String[] letter, String pre, int index) {
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
