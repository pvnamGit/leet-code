package hash_table.equal_rows_cols_pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
  public int equalPairs(int[][] grid) {
    int rows = grid.length, cols = grid[0].length, count = 0;
    Map<List<Integer>, Integer> map = new HashMap<>();
    for (int[] row : grid) {
      List<Integer> list = new ArrayList<>();
      for (int col = 0; col < cols; col++) {
        list.add(row[col]);
      }
      // count the occurrence of each row
      map.put(list, map.getOrDefault(list, 0) + 1);
    }
    for (int col = 0; col < cols; col++) {
      List<Integer> list = new ArrayList<>();
      for (int[] row : grid) {
        list.add(row[col]);
      }
      if (map.containsKey(list)) {
        count += map.get(list);
        System.out.println(list.toString());
      }
    }

    return count;
  }
}
