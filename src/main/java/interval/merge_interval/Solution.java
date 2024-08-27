package interval.merge_interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    List<int[]> result = new ArrayList<>();
    int[] prev = intervals[0];
    for (int index = 1; index < intervals.length; index++) {
      int[] interval = intervals[index];
      if (interval[0] < prev[1]) {
        prev[1] = Math.max(interval[1], prev[1]);
      } else {
        result.add(prev);
        prev = interval;
      }
    }
    result.add(prev);
    return result.toArray(new int[result.size()][]);
  }
}
