package Contests.contest156;

import java.util.ArrayList;

public class GetEqualSubstringsWithinBudget {
    int maxSub = 0;
    public void findMaxSub(String s, String t, int maxCost, int subLength) {
        if (subLength <= s.length()) {
            int lastCut = 0;
            ArrayList<Integer> cutPoint = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                int cost = 0;
                for (int m = i; m < i + subLength; m++) {
                    cost += Math.abs(s.charAt(m) - t.charAt(m));
                }
                if (cost > maxCost) {
                    findMaxSub(s.substring(lastCut, i), t.substring(lastCut, i), maxCost, subLength + 1);
                    lastCut = i + subLength;
                } else {
                    maxSub = Math.max(subLength, maxSub);
                }
            }
        }
    }
    /*public void findMaxSub(String s, String t, int maxCost, int subLength) {
        if (subLength <= s.length()) {
            for (int i = 0; i < s.length(); i++) {
                int cost = 0;
                if (i + subLength <= s.length()) {
                    for (int m = i; m < i + subLength; m++) {
                        cost += Math.abs(s.charAt(m) - t.charAt(m));
                    }
                    if (cost <= maxCost) {
                        maxSub++;
                        break;
                    }
                }
            }
            findMaxSub(s, t, maxCost, subLength + 1);
        }
    }*/
    public int equalSubstring(String s, String t, int maxCost) {
        findMaxSub(s, t, maxCost, 1);
        return maxSub;
    }

    public static void main(String[] args) {
        GetEqualSubstringsWithinBudget ms = new GetEqualSubstringsWithinBudget();
        System.out.println(ms.equalSubstring("abcd", "acde", 0));
    }
}
