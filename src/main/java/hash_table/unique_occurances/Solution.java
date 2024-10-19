package hash_table.unique_occurances;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurCount = new HashMap<>();
        Map<Integer, Integer> occurMap = new HashMap<>();
        for (int num: arr) {
            int count = occurMap.get(num) != null ? occurMap.get(num) + 1 : 1;
            occurMap.put(num, count);
        }
        for (int count : occurMap.values()) {
            if (occurCount.get(count) != null) return false;
            else occurCount.put(count, 0);
        }
        return true;
    }
}
