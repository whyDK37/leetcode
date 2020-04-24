package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BestTimeToBuyAndSellStockIITest {

  @Test
  public void testMaxProfit() {
    BestTimeToBuyAndSellStockII stockII = new BestTimeToBuyAndSellStockII();
    Assert.assertEquals(stockII.maxProfit(new int[]{7, 1, 5, 3, 6, 4}), 7);
    Assert.assertEquals(stockII.maxProfit(new int[]{1, 2, 3, 4, 5}), 4);
    Assert.assertEquals(stockII.maxProfit(new int[]{7, 6, 4, 3, 1}), 0);
  }


  @Test
  public void testMaxProfitV2() {
    BestTimeToBuyAndSellStockIIV2 stockII = new BestTimeToBuyAndSellStockIIV2();
    Assert.assertEquals(stockII.maxProfit(new int[]{7, 1, 5, 3, 6, 4}), 7);
    Assert.assertEquals(stockII.maxProfit(new int[]{1, 2, 3, 4, 5}), 4);
    Assert.assertEquals(stockII.maxProfit(new int[]{7, 6, 4, 3, 1}), 0);
  }


}