package dynamicprogramming;

public class LongestPalindromicSubstring {
    // Recursion:
    // Time: O(n^3)
//    public String longestPalindrome(String s) {
//        return findIt(l, s);
//    }
//
//    public String findIt(int length, String s) {
//        for (int i = 0; i <= l -length; i++) {
//            String goal = s.substring(i, i + length);
//            if (isPalindromic(goal)) {
//                return  goal;
//            }
//        }
//        return findIt(--length, s);
//    }
//    boolean isPalindromic(String s) {
//        for (int i = 0; i < l/2; i++) {
//            if (s.charAt(i) != s.charAt(l - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }


//    DP:
//    Time: O(n^2) Space: O(n^2)
    public String longestPalindrome(String s) {
        int l = s.length();
        if (l == 0) return "";
        int fst = 0;
        int last = 0;
        boolean[][] dp = new boolean[l][l];
        for (int j = 0; j < l; j++) {
            for (int i = j; i >= 0; i--) {
                if (j == i) {
                    dp[i][j] = true;
                } else if (j - i == 1 && s.charAt(j) == s.charAt(i)) {
                    dp[i][j] = true;
                    if (fst == last) {
                        fst = i;
                        last = j;
                    }
                } else {
                    dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                    if (dp[i][j] && j - i > last - fst) {
                        last = j;
                        fst = i;
                    }
                }
            }
        }
        return s.substring(fst, ++last);
    }


    public static void main(String[] args) {
        LongestPalindromicSubstring a = new LongestPalindromicSubstring();
        System.out.println(a.longestPalindrome("babab"));
    }
}
