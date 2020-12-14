package leetcode;

import org.testng.annotations.Test;

public class LetterCombinationsOfAPhoneNumberTest {

  @Test
  public void testLetterCombinations() {
    LetterCombinationsOfAPhoneNumber number = new LetterCombinationsOfAPhoneNumber();
    System.out.println(number.letterCombinations("7"));
    System.out.println(number.letterCombinations("234").size());
    System.out.println(number.letterCombinations("234"));
    System.out.println(number.letterCombinations("23"));
  }
}