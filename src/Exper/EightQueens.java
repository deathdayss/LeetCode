package Exper;

public class EightQueens {
    boolean[][] board = new boolean[8][8];
    public int result(int n) {
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (!board[y][x]) {
                    int iny = y - x;
                    int dey = y + x;
                    for (int i = 0; i < n; i++) {
                        if (iny >= 0 && iny < n) {
                            board[iny][i] = true;
                        }
                        if (dey >= 0 && dey < n) {
                            board[dey][i] = true;
                        }
                        iny++;
                        dey--;
                        board[y][i] = true;
                        board[x][i] = true;
                    }
                    y++;
                    x = -1;
                }
            }
        }
        return 1;
    }
}
