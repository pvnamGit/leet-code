package array.max_product_subarray;

public class Solution {
  public int maxProduct(int[] nums) {
    if (nums.length == 1) return nums[0];
    double left = 1, right = 1;
    double maxProd = nums[0];
    for (int index = 0; index < nums.length; index++) {
      if (left == 0) left = 1;
      if (right == 0) right = 1;
      left *= nums[index];
      right *= nums[nums.length - index - 1];
      maxProd = Math.max(maxProd, Math.max(left, right));
      System.out.println(maxProd);
    }
    return (int) maxProd;
  }
}
