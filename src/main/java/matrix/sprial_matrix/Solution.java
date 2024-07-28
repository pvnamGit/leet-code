package matrix.sprial_matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

  public List<Integer> spiralOrder(int[][] matrix) {
    int colSize = matrix[0].length;
    int rowSize = matrix.length;
    ArrayList<Integer> result = new ArrayList<>();
    int currentCol = -1, currentRow = 0, diversion = 1;
    // move forward horizontally and vertically if diversion is 1, if diversion < 1, move backward
    while (rowSize > 0 && colSize > 0) {
      // go thru column first
      for (int index = 0; index < colSize; index++) {
        currentCol += diversion;
        result.add(matrix[currentRow][currentCol]);
      }
      // reduce the row size because we finish loop the row
      rowSize--;

      for (int index = 0; index < rowSize; index++) {
        currentRow += diversion;
        result.add(matrix[currentRow][currentCol]);
      }
      // reduce the col size because we finish loop the current row
      colSize--;

      // flip the diversion
      diversion *= -1;
    }
    return result;
  }
}
