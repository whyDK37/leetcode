package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void testLetterCombinations() {
        System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("7"));
        System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("234").size());
        System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("234"));
        System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("23"));
    }
}