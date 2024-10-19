package hash_table.two_close_string;

import java.util.Arrays;

public class Solution {
  public boolean closeStrings(String word1, String word2) {
    if (word1.length() != word2.length()) return false;

    // Tạo hai mảng để đếm tần số ký tự của mỗi chuỗi
    int[] freq1 = new int[26];
    int[] freq2 = new int[26];

    // Tạo hai mảng để lưu trữ các ký tự có trong mỗi chuỗi
    boolean[] present1 = new boolean[26];
    boolean[] present2 = new boolean[26];

    for (char c : word1.toCharArray()) {
      freq1[c - 'a']++;
      present1[c - 'a'] = true;
    }

    for (char c : word2.toCharArray()) {
      freq2[c - 'a']++;
      present2[c - 'a'] = true;
    }

    if (!Arrays.equals(present1, present2)) return false;
    Arrays.sort(freq1);
    Arrays.sort(freq2);
    return Arrays.equals(freq1, freq2);
  }
}
