package dynamicprogramming;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        return findIt(s.length(), s);
    }

    public String findIt(int length, String s) {
        for (int i = 0; i <= s.length() -length; i++) {
            String goal = s.substring(i, i + length);
            if (isPalindromic(goal)) {
                return  goal;
            }
        }
        return findIt(--length, s);
    }
    boolean isPalindromic(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
