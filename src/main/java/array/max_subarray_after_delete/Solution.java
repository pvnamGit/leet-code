package array.max_subarray_after_delete;

import java.util.Arrays;
import java.util.List;

public class Solution {
  public int longestSubarray(int[] nums) {
    int left = 0, countZeros = 0, max = 0;
    for (int right = 0; right < nums.length; right++) {
      if (nums[right] == 0) countZeros++;
      while (countZeros == 2) {
        int value = nums[left++];
        if (value == 0) countZeros--;
      }
      max = Math.max(max, right - left);
    }
    Arrays.stream(nums).max().getAsInt();
    return max;
  }
}
