package hash_table.ransom_note;

import java.util.HashMap;

public class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    if (ransomNote.length() > magazine.length()) return false;
    HashMap<Character, Integer> magazineMap = new HashMap<>();
    // 1. Count the appearance times of characters in magazine
    for (Character c : magazine.toCharArray()) {
      int count = magazineMap.containsKey(c) ? magazineMap.get(c) + 1 : 1;
      magazineMap.put(c, count);
    }
    for (Character c : ransomNote.toCharArray()) {
      if (!magazineMap.containsKey(c)) return false;
      int count = magazineMap.get(c);
      if (count < 1) return false;
      magazineMap.put(c, count - 1);
    }
    return true;
  }

  public boolean canConstructWithoutHash(String ransomNote, String magazine) {
    if (ransomNote.length() > magazine.length()) return false;
    int[] characterCount = new int[26]; // inti array of 26 latin characters
    for (Character c : magazine.toCharArray()) {
      characterCount[c - 'a']++;
    }
    for (Character c : ransomNote.toCharArray()) {
      if (characterCount[c - 'a'] == 0) return false;
      characterCount[c - 'a']--;
    }
    return true;
  }
}
