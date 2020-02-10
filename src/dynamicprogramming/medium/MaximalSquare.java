package dynamicprogramming.medium;

public class MaximalSquare {
    // Naive solution:
    char[][] matrix;
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) return 0;
        this.matrix = matrix;
        int length = matrix.length;
        int width = matrix[0].length;
        int l = Math.min(length, width);
        for (int i = l; i >= 1; i--) {
            for (int x = 0; x <= length - i; x++) {
                for (int y = 0; y <= width - i; y++) {
                    if (isSquare(x, y, i))
                        return i*i;
                }
            }
        }
        return 0;
    }

    boolean isSquare(int x0, int y0, int l0) {
        System.out.println("x0: " + x0);
        System.out.println("y0: " + y0);
        System.out.println("l0: " + l0);
        for (int x = x0; x < x0 + l0; x++) {
            for (int y = y0; y < y0 + l0; y++) {
                if (matrix[x][y] != '1') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MaximalSquare a = new MaximalSquare();
        System.out.println(a.maximalSquare(new char[][]{new char[] {'1','0','1','0','0'}, new char[]{'1','0','1','1','1'},new char[]{'1','1','1','1','1'},new char[] {'1','0','0','1','0'}}));
    }
}
