package Netology;

public class ServiceTest {
    public int sumSales(long[] sales) {
            int sum = 0;
            for (long sale : sales) {
                sum += sale;
            }
            return sum;

        }
    public int avgSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
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

    public int minSales(long[] sales) {
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

    public int maxAvgSales(long[] sales) {
        int quantity = 0;
        int maxAvg = avgSales(sales);
        for (long sale : sales) {

            if (sale > maxAvg) {
                quantity += 1;

            }
        }
        return quantity;
    }
    public int minAvgSales(long[] sales) {
        int quantity = 0;
        int minAvg = avgSales(sales);
        for (long sale : sales) {

            if (sale < minAvg) {
                quantity += 1;

            }
        }
        return quantity;
    }
}



