package dynamicprogramming.medium;

public class MaximalSquare {
    // Naive solution:
    // Time: O(n^3) Space: O(1)
//    char[][] matrix;
//    public int maximalSquare(char[][] matrix) {
//        if (matrix.length == 0) return 0;
//        this.matrix = matrix;
//        int length = matrix.length;
//        int width = matrix[0].length;
//        int l = Math.min(length, width);
//        for (int i = l; i >= 1; i--) {
//            for (int x = 0; x <= length - i; x++) {
//                for (int y = 0; y <= width - i; y++) {
//                    if (isSquare(x, y, i))
//                        return i*i;
//                }
//            }
//        }
//        return 0;
//    }
//
//    boolean isSquare(int x0, int y0, int l0) {
//        System.out.println("x0: " + x0);
//        System.out.println("y0: " + y0);
//        System.out.println("l0: " + l0);
//        for (int x = x0; x < x0 + l0; x++) {
//            for (int y = y0; y < y0 + l0; y++) {
//                if (matrix[x][y] != '1') {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    // Time: O(n^3) Space: O(n^3)
//    public int maximalSquare(char[][] matrix) {
//        if (matrix.length == 0) return 0;
//        int width = matrix.length;
//        int length = matrix[0].length;
//        int side = Math.min(width, length);
//        int max = 0;
//        boolean[][][] dp = new boolean[width][length][side];
//        for (int l = 1; l <= side; l++) {
//            for (int x = 0; x <= width - l; x++) {
//                for (int y = 0; y <= length - l; y++) {
//                    if (l == 1) {
//                        if (matrix[x][y] == '1') {
//                            dp[x][y][1 - 1] = true;
//                            max = l;
//                        }
//                    } else {
//                        if (dp[x][y][l - 2] && dp[x][y + 1][l - 2] && dp[x + 1][y][l - 2] && dp[x + 1][y + 1][l - 2]) {
//                            dp[x][y][l - 1] = true;
//                            max = l;
//                        }
//                    }
//                }
//            }
//        }
//        return max * max;
//    }

    // Time: O(n^2) Space: O(n^2)
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int goal = 0;
        int width = matrix.length;
        int length = matrix[0].length;
        int[][] dp = new int[width + 1][length + 1];
        for (int y = 1; y < width; y++) {
            for (int x = 1; x < length; x++) {
                if (matrix[y - 1][x - 1] == '1') {
                    dp[y][x] = Math.min(dp[y - 1][x - 1], Math.min(dp[y - 1][x], dp[y][x - 1])) + 1;
                    goal = Math.max(dp[y][x], goal);
                }
            }
        }
        return goal * goal;
    }

    public static void main(String[] args) {
        MaximalSquare a = new MaximalSquare();
//        System.out.println(a.maximalSquare(new char[][]{new char[] {'1','0','1','0','0'}, new char[]{'1','0','1','1','1'},new char[]{'1','1','1','1','1'},new char[] {'1','0','0','1','0'}}));
        System.out.println(a.maximalSquare(new char[][]{new char[] {'1'}}));
    }
}
