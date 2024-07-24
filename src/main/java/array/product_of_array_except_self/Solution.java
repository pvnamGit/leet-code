package array.product_of_array_except_self;

// 238. Product of Array Except Self

// Solve by pre-computation
public class Solution {

  public int[] productExceptSelf(int[] nums) {
    int size = nums.length;
    int[] products = new int[size];
    for (int index = 0; index < size; index++) products[index] = 1;
    int temp = 1;
    for (int index = 0; index < size; index++) {
      products[index] = temp;
      temp *= nums[index];
    }
    temp = 1;
    for (int index = size - 1; index >= 0; index--) {
      products[index] *= temp;
      temp *= nums[index];
    }
    return products;
  }
}
