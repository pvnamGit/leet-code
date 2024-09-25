package string.reverse_words;

public class Solution {
  public static String reverseWords(String s) {
    String[] splitedString = s.replaceAll("\\s{2,}", " ").trim().split(" ");
    System.out.println("splitedString: "+ splitedString);
    if (splitedString.length == 1) return s;
    for (int index = 0; index < splitedString.length / 2; index++) {
      String temp = splitedString[index];
      splitedString[index] = splitedString[splitedString.length - index - 1];
      splitedString[splitedString.length - index - 1] = temp;
    }
    return String.join(" ", splitedString);
  }

  public static void main(String[] args) {
    String text = "a good   example";
    String res = reverseWords(text);
    System.out.println("RES: " + res);
  }
}
