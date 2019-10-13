package Contest157;

import java.util.ArrayList;
import java.util.List;

public class Q2QueensThatCanAttacktheKing {
    boolean existQueens(int[][] queens, int x, int y, List<List<Integer>> result) {
        boolean t = false;
        for (int[] k : queens) {
            if (k[0] == x && k[1] == y) {
                List<Integer> one = new ArrayList<>();
                one.add(x);
                one.add(y);
                result.add(one);
                t = true;
                break;
            }
        }
        return t;
    }
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        boolean[] isMeeting = new boolean[8];
        int[] xs = {-1,0,1,1,1,0,-1,-1};
        int[] ys = {-1,-1,-1,0,1,1,1,0};
        int direction = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int k = 1; k < 8; k++) {
            for (int i = 0; i < 8; i++) {
                if (direction == 8) {
                    break;
                }
                if (isMeeting[i]) {
                    continue;
                }
                int x = king[0] + xs[i] * k;
                int y = king[1] + ys[i] * k;
                if (x < 0 || y < 0 || x > 7 || y > 7 || existQueens(queens, x, y, result)) {
                    direction++;
                    isMeeting[i] = true;
                }
            }
            if (direction == 8) {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Q2QueensThatCanAttacktheKing a = new Q2QueensThatCanAttacktheKing();
        System.out.println(a.queensAttacktheKing(new int[][] {{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}}, new int[]{0,0}));
    }
}
