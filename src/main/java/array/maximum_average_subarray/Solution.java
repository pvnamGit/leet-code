package array.maximum_average_subarray;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Solution {
  private double roundToFiveDecimalPlaces(double value) {
    BigDecimal bd = new BigDecimal(value).setScale(5, RoundingMode.HALF_UP);
    return bd.doubleValue();
  }

  public double findMaxAverage(int[] nums, int k) {
    if (k == 1) {
      int max = Arrays.stream(nums).max().getAsInt();
      return ((double) max);
    }
    int startIdx = 0, subSum = 0;
    double max = Double.MIN_VALUE;
    for (int index = 0; index < nums.length; index++) {
      subSum += nums[index];
      if ((index - startIdx + 1) == k) {
        double maxAvg = (double) subSum / k;
        max = Math.max(maxAvg, max);
        subSum -= nums[startIdx];
        startIdx++;
      }
    }
    return max;
  }
}
