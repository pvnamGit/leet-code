package string.valid_palindrome;

//    125. Valid Palindrome
public class Solution {

  public String toAlphaNumericOnly(String input) {
    return input.replaceAll("[^a-zA-Z0-9]", "");
  }

  public boolean isPalindrome(String s) {
    String alphanumeric = this.toAlphaNumericOnly(s).toLowerCase();
    System.out.println(alphanumeric);
    int size = alphanumeric.length();
    if (size == 0) return true;
    for (int index = 0; index < size / 2; index++) {
      if (alphanumeric.charAt((size - index - 1)) != alphanumeric.charAt(index)) return false;
    }
    return true;
  }
}
