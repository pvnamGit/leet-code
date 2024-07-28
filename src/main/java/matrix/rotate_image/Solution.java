package matrix.rotate_image;

public class Solution {
  public void rotate(int[][] matrix) {
    int size = matrix.length;
    for (int row = 0; row < size / 2; row++) {
      for (int col = row; col < size - row - 1; col++) {
        // swap with the top-right
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][size - row - 1];
        matrix[col][size - row - 1] = temp;

        // swap with the bottom-right
        temp = matrix[row][col];
        matrix[row][col] = matrix[size - row - 1][size - col - 1];
        matrix[size - row - 1][size - col - 1] = temp;

        // swap with bottom-left
        temp = matrix[row][col];
        matrix[row][col] = matrix[size - col - 1][row];
        matrix[size - col - 1][row] = temp;
      }
    }
  }
}
