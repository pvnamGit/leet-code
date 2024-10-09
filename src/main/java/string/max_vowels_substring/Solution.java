package string.max_vowels_substring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
  static final Map<Character, Character> VOWEL_MAP =
      new HashMap<>() {
        {
          put('a', 'a');
          put('u', 'u');
          put('i', 'i');
          put('e', 'e');
          put('o', 'o');
        }
      };

  public static int maxVowels(String s, int k) {
    s = s.toLowerCase();
    int max = 0, count = 0;
    StringBuilder sub = new StringBuilder();

    for (int index = 0; index < s.length(); index++) {
      sub.append(s.charAt(index));
      if (VOWEL_MAP.containsKey(s.charAt(index))) count++;
      if (sub.length() == k) {
        max = Math.max(max, count);
        if (VOWEL_MAP.containsKey(sub.charAt(0))) count--;
        sub.deleteCharAt(0);
      }
    }

    return max;
  }

  public static void main(String[] args) {
    String s = "leetcode";
    int k = 3;
    int res = maxVowels(s, k);
    System.out.println("RESULT: " + res);
  }
}
