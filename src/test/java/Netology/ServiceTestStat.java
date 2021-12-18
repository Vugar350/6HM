package Netology;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestStat {

    @org.junit.jupiter.api.Test
    void sumSales() {
        ServiceStat service = new ServiceStat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void avgSales() {
        ServiceStat service = new ServiceStat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.avgSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxSales() {
        ServiceStat service = new ServiceStat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minSales() {
        ServiceStat service = new ServiceStat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxAvgSales() {
        ServiceStat service = new ServiceStat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.maxAvgSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minAvgSales() {
        ServiceStat service = new ServiceStat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.minAvgSales(sales);
        assertEquals(expected, actual);
    }
}
