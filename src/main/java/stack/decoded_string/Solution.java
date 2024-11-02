package stack.decoded_string;

import java.util.Stack;

public class Solution {
  public String decodeString(String s) {
    Stack<Integer> counter = new Stack<>();
    Stack<StringBuilder> resultStack = new Stack<>();
    int k = 0; // k for counting the number of repeated
    StringBuilder result = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        k = k * 10 + (c - '0');
      } else if (c == '[') {
        counter.push(k);
        resultStack.push(result); // push current result to stack
        result = new StringBuilder(); // after pushing, set the reset be empty;
        k = 0;
      } else if (c == ']') {
        StringBuilder decodeString = resultStack.pop();
        int count = counter.pop();
        decodeString.append(String.valueOf(result).repeat(Math.max(0, count)));
        result = decodeString;
      } else {
        result.append(c);
      }
    }
    return result.toString();
  }
}
