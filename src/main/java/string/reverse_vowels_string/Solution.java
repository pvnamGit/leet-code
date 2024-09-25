package string.reverse_vowels_string;

import java.util.Arrays;

public class Solution {
  private static final String[] VOWELS = {"a", "u", "e", "i", "o", "A", "U", "E", "I", "O"};

  public static String reverseVowels(String s) {
    int length = s.length();
    if (length == 1) return s;
    int left = 0, right = length - 1;
    while (right > left) {
      String leftStr = String.valueOf(s.charAt(left));
      String rightStr = String.valueOf(s.charAt(right));
      System.out.println("rightStr: " + rightStr);
      if (Arrays.asList(VOWELS).contains(leftStr) && Arrays.asList(VOWELS).contains(rightStr)) {
        s = swapString(left, right, s);
        System.out.println("after swap: " + s);

        left++;
        right--;
      } else if (Arrays.asList(VOWELS).contains(leftStr)
          && !Arrays.asList(VOWELS).contains(rightStr)) {
        right--;
      } else if (!Arrays.asList(VOWELS).contains(leftStr)
          && Arrays.asList(VOWELS).contains(rightStr)) {
        left++;
      } else {
        right--;
      }
    }
    return s;
  }

  private static String swapString(int left, int right, String str) {
    StringBuilder stringBuilder = new StringBuilder(str);
    char leftChar = stringBuilder.charAt(left), rightChar = stringBuilder.charAt(right);
    stringBuilder.setCharAt(left, rightChar);
    stringBuilder.setCharAt(right, leftChar);
    return stringBuilder.toString();
  }

  public static void main(String[] args) {
    String str = "IceCreAm";
    String exp = "AceCreIm";
    String res = reverseVowels(str);
    System.out.println("RES: " + res);
  }
}
