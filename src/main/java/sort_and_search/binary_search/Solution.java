package sort_and_search.binary_search;

public class Solution {
  public int search(int[] nums, int target) {
    int size = nums.length;
    if (nums[0] == target) return 0;
    if (nums[size - 1] == target) return size - 1;
    int left = 0, right = size - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) return mid;
      if (nums[mid] < target) left = mid + 1;
      if (nums[mid] > target) right = mid - 1;
    }
    return -1;
  }
}
