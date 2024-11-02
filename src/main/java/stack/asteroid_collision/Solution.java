package stack.asteroid_collision;

import java.util.Stack;

public class Solution {
  public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> stack = new Stack<>();

    for (int asteroid : asteroids) {
      // Xử lý trường hợp va chạm
      boolean destroyed = false;
      while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
        if (Math.abs(asteroid) > Math.abs(stack.peek())) {
          // Tiểu hành tinh di chuyển sang trái (âm) lớn hơn tiểu hành tinh di chuyển sang phải
          // (dương)
          stack.pop(); // Tiểu hành tinh ở đỉnh stack bị phá hủy
        } else if (Math.abs(asteroid) == Math.abs(stack.peek())) {
          // Cả hai tiểu hành tinh có cùng kích thước, cả hai bị phá hủy
          stack.pop();
          destroyed = true;
          break;
        } else {
          // Tiểu hành tinh di chuyển sang trái (âm) nhỏ hơn, nó bị phá hủy
          destroyed = true;
          break;
        }
      }
      // Nếu tiểu hành tinh không bị phá hủy, thêm nó vào stack
      if (!destroyed) {
        stack.push(asteroid);
      }
    }

    int[] result = new int[stack.size()];
    for (int index = stack.size() - 1; index >= 0; index--) {
      result[index] = stack.pop();
    }
    return result;
  }
}
