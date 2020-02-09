package Medium;


public class WordSearch {
    int[][] move = new int[][] {new int[] {1, 0}, new int[] {0, -1}, new int[] {0, 1}, new int[] {-1, 0}};

    public boolean exist(char[][] board, String word) {
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (board[y][x] == word.charAt(0)) {
                    char k = board[y][x];
                    board[y][x] = ' ';
                    if (result(board, word, 1, new int[] {y, x})) {
                        return true;
                    }
                    board[y][x] = k;
                }
            }
        }
        return false;
    }

    public boolean result(char[][] board, String word, int i, int[] place) {
        if (i == word.length()) {
            return true;
        }
        for (int k = 0; k < 4; k++) {
            int y = place[0] + move[k][0];
            int x = place[1] + move[k][1];
            if (y >= 0 && x >= 0 && y < board.length && x < board[0].length && board[y][x] == word.charAt(i)) {
                char q = board[y][x];
                board[y][x] = ' ';
                if (result(board, word, i + 1, new int[] {y, x})) {
                    return true;
                }
                board[y][x] = q;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        WordSearch a = new WordSearch();
        System.out.println(a.exist(new char[][]{new char[] {'A', 'B', 'C', 'E'}, new char[] {'S', 'F', 'C', 'S'}, new char[] {'A', 'D', 'E', 'F'}}, "ABCB"));
    }
}
