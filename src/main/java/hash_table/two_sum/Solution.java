package hash_table.two_sum;

import java.util.HashMap;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int index = 0; index < nums.length; index++) {
      int subtract = target - nums[index];
      if (map.get(subtract) == null) map.put(nums[index], index);
      else return new int[] {map.get(subtract), index};
    }
    return new int[] {};
  }
}
