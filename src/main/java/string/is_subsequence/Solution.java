package string.is_subsequence;

public class Solution {
  public static boolean isSubsequence(String s, String t) {
    if (t.length() < s.length()) return false;
    int count = 0, idx = 0;
    for (int index = 0; index < t.length(); index++) {
      System.out.println("CHAR of t at " + index + ": " + t.charAt(index));
      if (idx >= s.length()) return true;

      if (t.charAt(index) == s.charAt(idx)) {
        System.out.println("CHAR of s at " + idx + ": " + s.charAt(idx));
        count++;
        idx++;
      }
    }
    return count == s.length();
  }

  public static void main(String[] args) {
    String t = "ahbgdc", s = "abc";
    boolean res = isSubsequence(s, t);
    System.out.println("RES: " + res);
  }
}
