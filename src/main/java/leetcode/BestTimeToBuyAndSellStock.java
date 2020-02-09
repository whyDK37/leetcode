package leetcode;


public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int min = prices[0], dif = 0;
        for (int i = 1; i < prices.length; i++) {
            if (min < prices[i]) {
                dif = Math.max(prices[i] - min, dif);
            } else if (min > prices[i]) {
                min = prices[i];
            }
        }
        return dif;
    }
}
