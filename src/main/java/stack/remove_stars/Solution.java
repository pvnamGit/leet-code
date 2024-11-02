package stack.remove_stars;

import java.util.Stack;

public class Solution {
  public String removeStars(String s) {
    Stack<Character> stack = new Stack<Character>();

    for (Character c : s.toCharArray()) {
      if (!stack.isEmpty() && c.equals('*')) stack.pop();
      else stack.push(c);
    }
    StringBuilder res = new StringBuilder();
    for (Character c : stack) {
      res.append(c);
    }
    return res.toString();
  }
}
