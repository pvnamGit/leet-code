package matrix.generate_spiral_matrix;

public class Solution {
  public int[][] generateMatrix(int n) {
    int[][] result = new int[n][n];
    int rowSize = n, colSize = n;
    int currentRow = 0, currentCol = -1, diversion = 1, value = 1;
    while (rowSize > 0 && colSize > 0) {
      for (int col = 0; col < colSize; col++) {
        currentCol += diversion;
        result[currentRow][currentCol] = value;
        value++;
      }
      rowSize--;
      for (int row = 0; row < rowSize; row++) {
        currentRow += diversion;
        result[currentRow][currentCol] = value;
        value++;
      }
      colSize--;

      // flip diversion
      diversion *= -1;
    }
    return result;
  }
}
