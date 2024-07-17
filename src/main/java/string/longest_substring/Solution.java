package string.longest_substring;

import java.util.HashMap;

// Longest Substring not repeated

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    int size = s.length();
    if (size == 1) return 1; // return if size = 1
    int longestLength = 0;
    int repeatedIndex = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    for (int index = 0; index < size; index++) {
      if (map.get(s.charAt(index)) != null && map.get(s.charAt(index)) >= repeatedIndex) {
        // If character occurs in the map, and the index >= the repeated index, increase the
        // repeated index
        repeatedIndex = map.get(s.charAt(index)) + 1;
      } else {
        // If  character does not occur in the map, calculate the length from the current char to
        // the repeated index.
        int length = index - repeatedIndex + 1;
        longestLength = length > longestLength ? length : longestLength;
      }
      map.put(s.charAt(index), index);
    }
    return longestLength;
  }
}
