package hash_table.two_sum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap();
      for(int i = 0; i < nums.length; i++) {
        int subtract = target - nums[i];
        if (map.get(subtract) == null) {
          map.put(nums[i], i);
        } else {
          int[] result = {map.get(subtract), i};
          return result;
        }
      }
      int[] result = {};
      return result;
    }
  }

