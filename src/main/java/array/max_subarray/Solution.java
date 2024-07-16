package array.max_subarray;

// 53. Maximum Sub-array
public class Solution {
  public int maxSubArray(int[] nums) {
    int size = nums.length;
    if (size == 0) return 0;
    if (size == 1) return nums[0];
    int currentMax = nums[0];
    int maxSoFar = nums[0];
    for (int index = 1; index < size; index++) {
      currentMax = Math.max(currentMax, 0) + nums[index];
      System.out.println("index: " + index + " - Current max: " + currentMax);
      maxSoFar = Math.max(maxSoFar, currentMax);
      System.out.println("index: " + index + " - Max so far: " + maxSoFar);
    }
    return maxSoFar;
  }
}
