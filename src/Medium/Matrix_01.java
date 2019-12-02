package Medium;

public class Matrix_01 {
    public int[][] updateMatrix(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                boolean find0 = false;
                int add = 0;
                while (!find0) {
                    for (int i = -add; i <= add; i++) {
                        int px = i + x;
                        for (int k = -1; k <= 1; k += 2) {
                            int py = (add - Math.abs(i)) * k + y;
                            if (py >= 0 && py < matrix.length && px >= 0 && px < matrix[0].length && matrix[py][px] == 0) {
                                result[y][x] = add;
                                find0 = true;
                                break;
                            }
                        }
                    }
                    add++;
                }
            }
        }
        return result;
    }
}
