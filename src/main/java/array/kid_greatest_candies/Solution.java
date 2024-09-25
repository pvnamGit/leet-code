package array.kid_greatest_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int index = 0; index < candies.length; index++) {
            result.add(candies[index] + extraCandies >= max);
        }
        return result;
    }
}
