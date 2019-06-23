package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BestTimeToBuyAndSellStockTest {

  @Test
  public void testMaxProfit() {
    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
    assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[]{}), 0);
    assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[]{2}), 0);
    assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[]{4, 2, 3, 4, 5, 1, 9}), 8);
    assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}), 5);
    assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}), 0);
  }
}