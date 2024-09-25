package array.can_place_flower;

public class Solution {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    for (int index = 0; index < flowerbed.length; index++) {
      int left = index > 0 ? flowerbed[index - 1] : 0;
      int right = index < flowerbed.length - 1 ? flowerbed[index + 1] : 0;
      if (left == 0 && right == 0 && flowerbed[index] == 0) {
        flowerbed[index] = 1;
        n -= 1;
      }
    }
    return n <= 0;
  }
}
