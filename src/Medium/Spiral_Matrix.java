package Medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int state = 0;
        int[][] multiple = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int maxRow = matrix.length;
        int minRow = 0;
        if (maxRow == 0) {
            return result;
        }
        int maxCol = matrix[0].length - 1;
        if (maxCol == -1) {
            return result;
        }
        int minCol = 0;
        int currentRow = 0;
        int currentCol = 0;
        boolean checkFirst = false;
        for (int k = 0; k < matrix.length * matrix[0].length; k++) {
            result.add(matrix[currentRow][currentCol]);
            if (currentCol == minCol && currentRow == minRow && checkFirst) {
                state = 0;
                maxCol--;
                minCol++;
                checkFirst = false;
            } else if (currentCol == maxCol && currentRow == minRow) {
                state = 1;
                maxRow--;
            } else if (currentCol == maxCol && currentRow == maxRow) {
                state = 2;
                minRow++;
            } else if (currentCol == minCol && currentRow == maxRow) {
                checkFirst = true;
                state = 3;
            }
            currentCol += multiple[state][0];
            currentRow += multiple[state][1];
        }
        return result;
    }

    public static void main(String[] args) {
        Spiral_Matrix a = new Spiral_Matrix();
        System.out.println(a.spiralOrder(new int[][] {{3},{2}}));
    }
}
