package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O15_StockBuyAndSellTest {

    @Test
    public void shouldReturnMaxProfitUsingNaiveApproach() {
        O15_StockBuyAndSell stockBuyAndSell = new O15_StockBuyAndSell();
        int actual = stockBuyAndSell.maxProfit(new int[]{1, 5, 3, 8, 12}, 0, 4);
        Assertions.assertEquals(13, actual);
        actual = stockBuyAndSell.maxProfit(new int[]{30, 20, 10}, 0, 2);
        Assertions.assertEquals(0, actual);
        actual = stockBuyAndSell.maxProfit(new int[]{10, 20, 30}, 0, 2);
        Assertions.assertEquals(20, actual);
        actual = stockBuyAndSell.maxProfit(new int[]{1, 5, 3, 1, 2, 8}, 0, 5);
        Assertions.assertEquals(11, actual);
    }

    @Test
    public void shouldReturnMaxProfitUsingEfficientApproach() {
        O15_StockBuyAndSell stockBuyAndSell = new O15_StockBuyAndSell();
        int actual = stockBuyAndSell.maxProfitUsingEfficientSolution(new int[]{1, 5, 3, 8, 12});
        Assertions.assertEquals(13, actual);
        actual = stockBuyAndSell.maxProfitUsingEfficientSolution(new int[]{30, 20, 10});
        Assertions.assertEquals(0, actual);
        actual = stockBuyAndSell.maxProfitUsingEfficientSolution(new int[]{10, 20, 30});
        Assertions.assertEquals(20, actual);
        actual = stockBuyAndSell.maxProfitUsingEfficientSolution(new int[]{1, 5, 3, 1, 2, 8});
        Assertions.assertEquals(11, actual);
    }

}