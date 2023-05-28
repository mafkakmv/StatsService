package ru.netology.javaqa;

import ru.netology.javaqa.StatsService;

public class Main {
    public static void main(String[] args) {
        long[] my_sale = new long[12];
        my_sale [0] = 8;
        my_sale [1] = 15;
        my_sale [2] = 13;
        my_sale [3] = 15;
        my_sale [4] = 17;
        my_sale [5] = 20;
        my_sale [6] = 19;
        my_sale [7] = 20;
        my_sale [8] = 7;
        my_sale [9] = 14;
        my_sale [10] = 14;
        my_sale [11] = 18;
        StatsService service = new StatsService();
        System.out.println( service.minSales(my_sale));
        System.out.println( service.maxSales(my_sale));
        System.out.println( service.sumAllMonth(my_sale));
        System.out.println( service.sumAverageMonth(my_sale));
        System.out.println( service.minSalesUnderAverage(my_sale));
        System.out.println( service.maxSalesAboveAverage(my_sale));
    }

}