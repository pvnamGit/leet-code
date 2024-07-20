package recursion.generate_parenthese;

// 22. Generate Parentheses
// Given n pairs of parentheses, write a function to generate all combinations of well-formed
// parentheses.
// Example 1:
//
// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2:
//
// Input: n = 1
// Output: ["()"]

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public void parseParentheses(
      List<String> result, int leftParentheses, int rightParentheses, String str, int n) {
    if (str.length() == n * 2) {
      result.add(str);
      return;
    }
    if (leftParentheses < n)
      parseParentheses(result, leftParentheses + 1, rightParentheses, str + "(", n);
    if (rightParentheses < leftParentheses)
      parseParentheses(result, leftParentheses, rightParentheses + 1, str + ")", n);
  }

  public List<String> generateParentheses(int n) {
    ArrayList<String> result = new ArrayList();
    parseParentheses(result, 0, 0, "", n);
    return result;
  }
}
