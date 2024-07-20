package recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {


  public void generateSubsets(
      int[] nums, int start, List<Integer> subset, List<List<Integer>> result) {
      result.add(new ArrayList<>(subset));
      for (int index = start; index < nums.length; index++) {
        subset.add(nums[index]);
        generateSubsets(nums, index + 1, subset, result);
        subset.remove(subset.size() - 1);
      }
  }

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    generateSubsets(nums, 0, new ArrayList<Integer>(), result);
    return result;
  }
}
