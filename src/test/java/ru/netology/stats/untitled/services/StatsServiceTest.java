package ru.netology.stats.untitled.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.untitled.services.StatsService;

public class StatsServiceTest {

    @Test
    public void SalesAmount() {

        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAmount = 180;
        int actualAmount = service.getSalesAmount(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void SalesAmountAverage() {

        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAverage = 15;
        int actualAverage = service.getSalesAmountAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void SalesMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void SalesMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMinMonth = 8;
        int actualMinMonth = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void SalesAmountBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedBelowAverage = 5;
        int actualBelowAverage = service.getSalesAmountBelowAverage(sales);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void SalesAmountHigherAverage() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedHigherAverage = 5;
        int actualHigherAverage = service.getSalesAmountHigherAverage(sales);

        Assertions.assertEquals(expectedHigherAverage, actualHigherAverage);
    }
}
