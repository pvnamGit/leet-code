package hash_table.different_2_arrs;

import java.util.*;

public class Solution {
  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    HashMap<Integer, Integer> map2 = new HashMap<>();
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    for (int i : nums1) {
      map.put(i, 0);
    }
    for (int i : nums2) {
      if (map.containsKey(i)) map.put(i, map.get(i) + 1);
      else map2.put(i, map2.get(i) != null ? map2.get(i) + 1 : 0);
    }
    for (int i : map.keySet()) {
      if (map.get(i) == 0) list1.add(i);
    }
    result.add(list1);
    result.add(new ArrayList<>(map2.keySet()));
    return result;
  }
}
