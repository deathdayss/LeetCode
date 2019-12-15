package Medium;

public class UniquePaths {
    int result;
    public int uniquePaths(int m, int n) {
        helper(0,0,m,n);
        return result;
    }

    public void helper(int x, int y, int m, int n) {
        if (x == m - 1 && y == n - 1) {
            result++;
        }
        int t = 0;
        if (x + 1 < m) {
            helper(x + 1, y, m, n);
        }
        if (y + 1 < n) {
            helper(x, y + 1, m, n);
        }
    }

    public static void main(String[] args) {
        UniquePaths a = new UniquePaths();
        System.out.println(a.uniquePaths(19,13));
    }
}
