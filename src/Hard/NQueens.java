package Hard;

import java.util.LinkedList;
import java.util.List;

public class NQueens {
    List<List<String>> result = new LinkedList<>();
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
                    List<String> single = new LinkedList<>();
                    for (int y = 0; y < length; y++) {
                        String k = "";
                        for (int x = 0; x < length; x++) {
                            k += board[y][x] ? "Q" : ".";
                        }
                        single.add(k);
                    }
                    result.add(single);
                } else {
                    getIt(row + 1);
                }
                board[row][d] = false;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        length = n;
        board = new boolean[n][n];
        getIt(0);
        return result;
    } // Test contributions again
}
