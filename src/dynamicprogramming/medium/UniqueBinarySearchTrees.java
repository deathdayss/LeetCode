package dynamicprogramming.medium;

public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    dp[i] += dp[i -1];
                    System.out.println("a " + dp[i]);
                } else {
                    dp[i] += dp[j - 1] * dp[i - j - 1];
                    System.out.println("b " + dp[i]);
                }
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        UniqueBinarySearchTrees a = new UniqueBinarySearchTrees();
        System.out.println(a.numTrees(3));
    }
}
