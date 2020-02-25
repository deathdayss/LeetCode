package Contests.Contest165;

public class Count_Square_Submatrices_with_All_Ones {
    public int countSquares(int[][] matrix) {
        int num = 0;
        int mSide = Integer.max(matrix.length, matrix[0].length);
        for (int l = 0; l <= mSide; l++) {
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[r].length; c++) {
                    if (matrix[r][c] == 1 && r + l < matrix.length && c + l < matrix[r].length) {
                        boolean allOne = true;
                        for (int a = r; a <= r+l; a++) {
                            for (int b = c; b <= c+l; b++) {
                                if (matrix[a][b] != 1) {
                                    allOne = false;
                                    break;
                                }
                            }
                            if (!allOne) {
                                break;
                            }
                        }
                        if (allOne) {
                            num++;
                        }
                    }
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Count_Square_Submatrices_with_All_Ones a = new Count_Square_Submatrices_with_All_Ones();
        System.out.println(a.countSquares(new int[][] {{0,1,1,1},{1,1,0,1},{1,1,1,1},{1,0,1,0}}));
    }
}
