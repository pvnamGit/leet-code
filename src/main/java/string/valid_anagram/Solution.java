package string.valid_anagram;

import java.util.HashMap;
import java.util.Map;

// 242. Valid Anagram
public class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    HashMap<Character, Integer> map = new HashMap<>();
    for (Character c : s.toCharArray()) {
      int count = map.get(c) == null ? 0 : map.get(c);
      map.put(c, count + 1);
    }
    for (Character c : t.toCharArray()) {
      if (map.get(c) == null) return false;
      int count = map.get(c);
      map.put(c, count - 1);
    }

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 0) return false;
    }
    return true;
  }
}
