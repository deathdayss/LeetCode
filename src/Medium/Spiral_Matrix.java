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
        for (int k = 0; k < matrix.length * matrix[0].length; k++) {
            System.out.println("current is " + "(" + currentCol + ", " + currentRow + ")");
            System.out.println("min col is " + minCol);
            System.out.println("max col is " + maxCol);
            System.out.println("min row is " + minRow);
            System.out.println("max row is " + maxRow);
            result.add(matrix[currentRow][currentCol]);
            System.out.println("Added " + matrix[currentRow][currentCol]);
            if (!( currentRow == 0 &&  currentCol == 0) && currentCol == minCol + 1 && currentRow == minRow) {
                state = 0;
                maxCol--;
                minCol++;
            } else if (currentCol == maxCol && currentRow == minRow) {
                state = 1;
                maxRow--;
            } else if (currentCol == maxCol && currentRow == maxRow) {
                state = 2;
                minRow++;
            } else if (currentCol == minCol && currentRow == maxRow) {
                state = 3;
            }
            System.out.println("state is " + state);
            currentCol += multiple[state][0];
            currentRow += multiple[state][1];
        }
        return result;
    }

    public static void main(String[] args) {
        Spiral_Matrix a = new Spiral_Matrix();
        System.out.println(a.spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,10}, {13,14,15,16}}));
    }
}
