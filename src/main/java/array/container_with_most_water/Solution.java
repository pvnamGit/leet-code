package array.container_with_most_water;

public class Solution {
  public int maxArea(int[] height) {
    int left = 0, right = height.length - 1, max = 0;
    while (left < right) {
      System.out.println("At left: " + left);
      System.out.println("At right: " + right);
      int amount = calculateAmountOfWater(height, left, right);
      System.out.println("Has amount: "+ amount);
      max = Math.max(amount, max);
      System.out.println("Has max: "+ max);
      if (height[left] < height[right]) left++;
      else right--;
    }
    return max;
  }

  public int calculateAmountOfWater(int[] height, int left, int right) {
    int xAxis = right - left;
    System.out.println("xAxis: " + xAxis);
    int yAxis = Math.min(height[left], height[right]);
    System.out.println("yAxis: " + yAxis);
    return xAxis * yAxis;
  }
}
