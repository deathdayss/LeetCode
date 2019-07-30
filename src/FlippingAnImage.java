public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int t = A.length;
        int g = A[0].length;
        int[][] tar = new int[t][g];
        for(int i = 0; i < t; i++) {
            for(int d = 0; d < g; d++) {
                if (A[i][d] == 0) {
                    tar[i][g - d - 1] = 1;
                }
                else
                {
                    tar[i][g - d - 1] = 0;
                }
            }
        }
        return tar;
    }
}
