package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maximumMonth(long[] sales) {
        int montMaximumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[montMaximumSale]) {
                montMaximumSale = i;
            }
        }
        return montMaximumSale + 1;
    }

    public int minimumMonth(long[] sales) {
        int MinimumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MinimumSale]) {
                MinimumSale = i;
            }
        }
        return MinimumSale + 1;
    }

    public int mothBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {

            if (sale < averageSale) {
                counter++;

            }
        }
        return counter;
    }

    public int mothAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {

            if (sale > averageSale) {
                counter++;

            }
        }
        return counter;
    }
}
