package array.max_consecutive_one;

import java.util.Arrays;

public class Solution {
  public static int longestOnes(int[] nums, int k) {
    int left = 0, max = 0, countZeros = 0;
    for (int right = 0; right <nums.length; right++) {
      if (nums[right] == 0) countZeros++;
      while (countZeros > k) {
        if (nums[left] == 0) {
          countZeros--;
        }
        left++;
      }
      max = Math.max(max, right - left +1);
    }
    return max;
  }

  public static void main(String[] args) {
    int nums[] = new int[] {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
    int k = 2;

    int res = longestOnes(nums, k);
    System.out.println("RES: " + res);
  }
}
