package array.max_number_of_k_sum_pair;

import java.util.HashMap;

public class Solution {
  public static int maxOperations(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 0;
    for (int index = 0; index < nums.length; index++) {
      int minus = k - nums[index];

      if (map.getOrDefault(minus, 0) > 0) {
        // Nếu tìm thấy một phần tử có tổng bằng k, giảm số lượng của phần tử đó
        count++;
        map.put(minus, map.get(minus) - 1); // Giảm số lần xuất hiện của minus
      } else {
        // Thêm hoặc tăng số lượng của phần tử hiện tại vào map
        map.put(nums[index], map.getOrDefault(nums[index], 0) + 1);
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] nums = {2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2};
    int k = 3;
    int c = maxOperations(nums, k);
    System.out.println("RES:" + c);
  }
}
