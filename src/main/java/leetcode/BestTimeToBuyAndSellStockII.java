package leetcode;


/**
 * 122 https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimeToBuyAndSellStockII {

  public int maxProfit(int[] prices) {
    if (prices.length <= 1) {
      return 0;
    }
    int i = 0;
    int valley = prices[0];
    int peak = prices[0];
    int maxprofit = 0;
    while (i < prices.length - 1) {
      while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
        i++;
      }
      valley = prices[i];
      while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
        i++;
      }
      peak = prices[i];
      maxprofit += peak - valley;
    }
    return maxprofit;
  }
}
