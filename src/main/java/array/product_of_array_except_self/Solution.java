package array.product_of_array_except_self;

// 238. Product of Array Except Self

// Solve by pre-computation
public class Solution {

  public int[] productExceptSelf(int[] nums) {
    if (nums.length == 1) return new int[] {0};
    int size = nums.length;
    // 1. run from the start -> end, calculate multiply  digits on the lefts
    int[] products = new int[size]; // init the products result
    // 2 init 1 for whole element of products
    for (int index = 0; index < size; index++) products[index] = 1;
    // 3. loop from start -> end, calculate multiply values on the left of the current index
    // then assign to product's index
    int temp = 1; // init the temporary variable
    for (int index = 0; index < size; index++) {
      products[index] = temp;
      temp *= nums[index];
    }
    // 4. loop from end -> start, calculate multiply values on the right of the current index
    // then multiply with value on product's current index, then assign to product's index
    // This method help to multiply elements except itself
    temp = 1; // re-assign the temporary variable
    for (int index = size - 1; index >= 0; index--) {
      products[index] *= temp;
      temp *= nums[index];
    }
    return products;
  }
}
