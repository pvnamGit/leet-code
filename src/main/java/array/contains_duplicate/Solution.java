package array.contains_duplicate;

import java.util.HashMap;

public class Solution {
  public boolean containsDuplicate(int[] nums) {
    if (nums.length == 0 || nums.length == 1) return false;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int index = 0; index < nums.length; index++) {
      if (map.containsKey(nums[index])) return true;
      map.put(nums[index], index);
    }
    return false;
  }
}
