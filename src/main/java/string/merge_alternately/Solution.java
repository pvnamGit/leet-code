package string.merge_alternately;

public class Solution {
  public String mergeAlternately(String word1, String word2) {
    String result = "";
    int size = Math.max(word1.length(), word2.length());
    for (int index = 0; index < size; index++) {
      if (index < word1.length()) result = result.concat(String.valueOf(word1.charAt(index)));
      if (index < word2.length()) result = result.concat(String.valueOf(word2.charAt(index)));
    }
    return result;
  }
}
