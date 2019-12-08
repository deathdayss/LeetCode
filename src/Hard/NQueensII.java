package Hard;

import java.util.LinkedList;
import java.util.List;

public class NQueensII {
    int result = 0;
    int length;
    boolean[][] board;

    public void getIt(int row) {
        for (int d = 0; d < length; d++) {
            boolean isValid = true;
            int iny = row - d;
            int dey = row + d;
            for (int i = 0; i < length; i++) {
                if (iny >= 0 && iny < length && board[iny][i] || dey >= 0 && dey < length && board[dey][i] || board[i][d]) {
                    isValid = false;
                    break;
                }
                iny++;
                dey--;
            }
            if (isValid) {
                board[row][d] = true;
                if (row == length - 1) {
                    result++;
                } else {
                    getIt(row + 1);
                }
                board[row][d] = false;
            }
        }
    }

    public int totalNQueens(int n) {
        length = n;
        board = new boolean[n][n];
        getIt(0);
        return result;
    }
}
