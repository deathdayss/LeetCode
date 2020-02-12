package dynamicprogramming.easy;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int mp = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                mp = Math.max(mp, prices[j] - prices[i]);
            }
        }
        return mp;
    }
}
