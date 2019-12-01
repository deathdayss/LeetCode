package Contest165;

public class Find_Winner_on_a_Tic_Tac_Toe_Game {
    public String tictactoe(int[][] moves) {
        int[][] A = new int[(int)Math.ceil((double) moves.length/2)][];
        int[][] B = new int[moves.length/2][];
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == 0) {
                A[i/2] = moves[i];
            } else {
                B[(i-1)/2] = moves[i];
            }
        }
        int[][][] proper = new int[][][] {{{0,1}, {0,2}, {0,0}},{{1,0}, {1,1},{1,2}},{{2,0},{2,1},{2,2}},{{0,0},{1,0},{2,0}},{{0,1},{1,1},{2,1}},{{0,2},{1,2},{2,2}},{{0,0},{1,1},{2,2}},{{0,2},{1,1},{2,0}}};
        for (int[][] sequence : proper) {
            boolean inA = true;
            boolean inB = true;
            for (int[] m : sequence) {
                boolean singleA = false;
                boolean singleB = false;
                for (int[] g : A) {
                    if (m[0] == g[0] && m[1] == g[1]) {
                        singleA = true;
                        break;
                    }
                }
                for (int[] g : B) {
                    if (m[0] == g[0] && m[1] == g[1]) {
                        singleB = true;
                        break;
                    }
                }
                if (!singleA) {
                    inA = false;
                }
                if (!singleB) {
                    inB = false;
                }
            }
            if (inA) {
                return "A";
            }
            if (inB) {
                return "B";
            }
        }
        if (moves.length == 9) {
            return "Draw";
        }
        return "Pending";
    }

    public static void main(String[] args) {
        System.out.println(Math.ceil((double) 2/3));
    }
}
