package Contest163;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public void shiftOnce(int[][] grid) {
        int next = grid[grid.length-1][grid[0].length-1];
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int the = grid[i][j];
                grid[i][j] = next;
                next = the;
            }
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for (int t = 0; t < k; t++) {
            shiftOnce(grid);
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < grid.length; i++) {
            List<Integer> one = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                one.add(grid[i][j]);
            }
            result.add(one);
        }
        return result;
    }
}
