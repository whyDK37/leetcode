package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BestTimeToBuyAndSellStockIIITest {

    @Test
    public void testMaxProfit() {
        BestTimeToBuyAndSellStockIII stock = new BestTimeToBuyAndSellStockIII();
        Assert.assertEquals(stock.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}), 6);
        Assert.assertEquals(stock.maxProfit(new int[]{1, 2, 3, 4, 5}), 4);
        Assert.assertEquals(stock.maxProfit(new int[]{7, 6, 4, 3, 1}), 0);
    }
}