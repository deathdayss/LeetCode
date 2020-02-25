package Contests.Contest176;

public class CountNegativeNumbersinaSortedMatrix {
    public int countNegatives(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int a = 0;
        for(int[] k : grid) {
            for (int m : k) {
                if (m < 0) {
                    a++;
                }
            }
        }
        return a;
    }
}
