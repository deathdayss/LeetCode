package Medium;

public class DecodeWays {
    public int numDecodings(String s) {
        if (s.length() == 0)
            return 0;
        int[] dp = new int[s.length()];
        for (int i = 0; i < dp.length; i++) {
            if (i == 0) {
                if (s.charAt(i) == '0') {
                    return 0;
                }
                dp[0] = 1;
            } else if (i == 1) {
                if (s.charAt(i) == '0') {
                    if (s.charAt(i-1) != '1'&& s.charAt(i-1) != '2') {
                        return 0;
                    }
                    dp[i] = dp[i-1];
                } else {
                    if (Integer.parseInt(s.substring(i-1, i+1)) <= 26) {
                        dp[i] += dp[i-1] + 1;
                    } else {
                        dp[i] = dp[i-1];
                    }
                }
            } else {
                if (s.charAt(i) == '0') {
                    if (s.charAt(i-1) != '1'&& s.charAt(i-1) != '2') {
                        return 0;
                    }
                    dp[i] = dp[i-2];
                } else {
                    if (s.charAt(i-1) == '0' || Integer.parseInt(s.substring(i-1, i+1)) > 26) {
                        dp[i] = dp[i-1];
                    } else {
                        dp[i] += dp[i-1] + dp[i-2];
                    }
                }
            }
        }
        return dp[s.length() - 1];
    }

    public static void main(String[] args) {
        DecodeWays a = new DecodeWays();
        System.out.println(a.numDecodings("101"));
    }
}
