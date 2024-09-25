package string.compressing;

public class Solution {

  public int compress(char[] chars) {
    int length = chars.length;
    if (length == 1) return 1;
    int curIdx = 0, newIdx = 0;
    while (curIdx < length) {
      int temp = 1;
      char curChar = chars[curIdx];

      while ((curIdx + temp < length) && chars[curIdx + temp] == curChar) temp++;

      if (temp == 1) chars[newIdx++] = curChar;
      else {
        chars[newIdx++] = curChar;
        for (char c : String.valueOf(temp).toCharArray()) chars[newIdx++] = c;
      }

      curIdx += temp;
    }
    return newIdx;
  }
}
