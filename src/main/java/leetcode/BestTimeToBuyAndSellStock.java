package leetcode;


/**
 * 121 https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    if (prices.length <= 1) {
      return 0;
    }
    int min = prices[0], maxprofit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (min > prices[i]) {
        min = prices[i];
      }
      maxprofit = Math.max(prices[i] - min, maxprofit);
    }
    return maxprofit;
  }
}
