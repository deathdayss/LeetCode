package dynamicprogramming.easy;

public class BestTimetoBuyandSellStock {
    // Time: O(n^2) Space: O(n)
//    public int maxProfit(int[] prices) {
//        int mp = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                mp = Math.max(mp, prices[j] - prices[i]);
//            }
//        }
//        return mp;
//    }
    public int maxProfit(int[] prices) {
        int mp = 0;
        int mv = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            mp = Math.max(prices[i] - mv, mp);
            mv = Math.min(prices[i], mv);
        }
        return mp;
    }
}
