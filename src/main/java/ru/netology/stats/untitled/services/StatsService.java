package ru.netology.stats.untitled.services;
public class StatsService {

    public int getSalesAmount(int[] sales ){
        int SalesAmount = 0;
        for (int i : sales){
            SalesAmount = SalesAmount + i;
        }
        return SalesAmount;
    }

    public int getSalesAmountAverage(int[] sales ){
     int averageAmount = getSalesAmount(sales) / sales.length;
     return averageAmount;
    }

    public  int getMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public  int getMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getSalesAmountBelowAverage(int[] sales ){
        int t = getSalesAmountAverage(sales);
        int belowAverage = 0;
        for (long sale : sales) {
            if (sale < t) {
                belowAverage = belowAverage + 1;
            }
        }
        return belowAverage;
    }

    public int getSalesAmountHigherAverage(int[] sales ){
        int t = getSalesAmountAverage(sales);
        int higherAverage = 0;
        for (long sale : sales) {
            if (sale > t) {
                higherAverage = higherAverage + 1;
            }
        }
        return higherAverage;
    }
}
