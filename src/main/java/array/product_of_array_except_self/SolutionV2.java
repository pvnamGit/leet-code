package array.product_of_array_except_self;

import java.util.Arrays;
import java.util.Collections;

public class SolutionV2 {
  public static int[] productExceptSelf(int[] nums) {
    int size = nums.length;
    int[] products = new int[size];
    Arrays.fill(products, 1);
    int temp = 1;
    for (int index = 0; index < size; index++) {
      System.out.println("1st: At index of " + index + " Temp: " + temp);
      products[index] = temp;
      System.out.println("1st: At index of " + index + " Product: " + products[index]);
      temp *= nums[index];
    }
    temp = 1;
    for (int index = size - 1; index >= 0; index--) {
      System.out.println("2nd: At index of " + index + " Temp: " + temp);
      products[index] *= temp;
      System.out.println("2nd: At index of " + index + " Product: " + products[index]);
      temp *= nums[index];
    }
    return products;
  }

  public static void main(String[] args) {
    int[] nums = {-1, 1, 0, -3, 3};
    int[] res = productExceptSelf(nums);
    Collections.singletonList(res).forEach(System.out::println);
  }
}
