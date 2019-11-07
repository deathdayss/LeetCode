package Medium;

public class Soup_Servings {
    int[][] serves = new int[][] {new int[] {100, 0}, new int[] {75, 25}, new int[] {50, 50}, new int[] {25, 75}};
    double aFirst = 0;
    double abBoth = 0;
    public double soupServings(int N) {
        getIt(N, N, 1);
        return aFirst + 0.5 * abBoth;
    }

    public void getIt(int a, int b, double pro) {
        if (a <= 0 && b <= 0) {
            abBoth += pro;
        } else if (a <= 0 && b > 0) {
            aFirst += pro;
        } else if (a > 0 && b > 0) {
            for (int i = 0; i < 4; i++) {
                getIt(a - serves[i][0], b - serves[i][1], pro * 0.25);
            }
        }
    }
}
