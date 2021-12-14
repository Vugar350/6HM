package Netology;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestTest {

    @org.junit.jupiter.api.Test
    void sumSales() {
        ServiceTest service=new ServiceTest();
        long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected=180;
        long actual=service.sumSales(sales);
        assertEquals(expected,actual);

    }
    @org.junit.jupiter.api.Test
    void avgSales() {
        ServiceTest service=new ServiceTest();
        long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected=15;
        long actual=service.avgSales(sales);
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void maxSales() {
        ServiceTest service=new ServiceTest();
        long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected=8;
        long actual=service.maxSales(sales);
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void minSales() {
        ServiceTest service=new ServiceTest();
        long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected=9;
        long actual=service.minSales(sales);
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void maxAvgSales() {
        ServiceTest service=new ServiceTest();
        long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected=5;
        long actual=service.maxAvgSales(sales);
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void minAvgSales() {
        ServiceTest service=new ServiceTest();
        long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected=5;
        long actual=service.minAvgSales(sales);
        assertEquals(expected,actual);
    }
}
