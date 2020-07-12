package leetcode;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {

    // filter
    String filter = s.replaceAll("[^A-Za-z0-9]", "");
    // revert  compare
    return new StringBuilder(filter).reverse().toString().equalsIgnoreCase(filter);

  }
}
