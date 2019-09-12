package Medium;

public class MinimumFallingPathSum {
    int min = 101;
    int length = 0;
    public void helper(int row, int col, int total, int[][] A) {
        if(row == length) {
            min = Math.min(total, min);
        } else {
            for (int i = 0; i < A[row].length; i++){
                if (Math.abs(i - col) <= 1) {
                    helper(row + 1, i, total + A[row][i], A);
                }
            }
        }
    }
    public int minFallingPathSum(int[][] A) {
        length = A.length;
        for (int i = 0; i < A[0].length; i++){
            helper(1, i, A[0][i], A);
        }
        return min;
    }
}
