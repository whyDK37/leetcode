package leetcode;


public class BestTimeToBuyAndSellStockIIV2 {

  // 简化版本，只要明天的股价比今天高，就进行一次交易，利润落袋
  // 所以计算逻辑就简化成比较两个值大小，然后累加差值
  public int maxProfit(int[] prices) {
    int maxprofit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        maxprofit += prices[i] - prices[i - 1];
      }
    }
    return maxprofit;
  }
}
