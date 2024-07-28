package matrix.set_zeroes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
  public void setZeroes(int[][] matrix) {
    int rowSize = matrix.length;
    int colSize = matrix[0].length;
    ArrayList<String> arr = new ArrayList<>();
    for (int row = 0; row < rowSize; row++)
      for (int col = 0; col < colSize; col++) if (matrix[row][col] == 0) arr.add(row + "_" + col);

    for (int index = 0; index < arr.size(); index ++) {
      String[] zeroIndex = arr.get(index).split("_");
      Integer rowIndex = Integer.valueOf(zeroIndex[0]);
      Integer colIndex = Integer.valueOf(zeroIndex[1]);
      for (int row = 0; row < rowSize; row++) matrix[row][colIndex] = 0;
      for (int col = 0; col < col; col++) matrix[rowIndex][col] = 0;
    }
  }
}
