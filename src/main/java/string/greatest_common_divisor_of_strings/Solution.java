package string.greatest_common_divisor_of_strings;

public class Solution {
  public String gcdOfStrings(String str1, String str2) {
    int gcd = gcd(str1.length(), str2.length());
    System.out.println("gcd: " + gcd);
    return str1.concat(str2).equals(str2.concat(str1)) ? str1.substring(0, gcd) : "";
  }

  private int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }
}
