package array.increasing_sub_sequence;

public class Solution {
  public boolean increasingTriplet(int[] nums) {
    int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
    for (int index = 0; index < nums.length; index++)
      if (nums[index] > left) left = nums[index];
      else if (nums[index] > right) right = nums[index];
      else return true;

    return false;
  }
}
