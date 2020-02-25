package Contests.Contest162;

public class CellswithOddValuesInaMatrix {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] result = new int[n][m];
        for (int[] each : indices) {
            if (each[0] >= 0 && each[0] < result.length) {
                for (int i = 0; i < result[each[0]].length; i++) {
                    result[each[0]][i]++;
                }
            }
            if (each[1] >= 0 && each[1] < result[0].length) {
                for (int i = 0; i < result.length; i++) {
                    result[i][each[1]]++;
                }
            }
        }
        int odd = 0;
        for (int[] k : result) {
            for (int g : k) {
                if (g % 2 == 1) {
                    odd++;
                }
            }
        }
        return odd;
    }
}
