package ru.netology.javaqa;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int sumAllMonth(long[] sales) {
        int sum = 0;
        for (long sale : sales)
            sum += sale;
        return sum;

        /*
        int sumAll[] = new int[]{0};
        int sum1 = 0;
        for (int i = 0; i < sumAll.length; i++) {
            sum1 = sum1 + sumAll[i];
        }
        return sum1;
        */
    }

    public int sumAverageMonth(long[] sales) {
        int average = sumAllMonth(sales) / 12;
        return average;
        /*
        int sumAverage[] = new int[]{0};
        int sum2 = 0;
        for (int i = 0; i < sumAverage.length; i++) {
            sum2 = (sum2 + sumAverage[i])/sumAverage.length;
        }
        return sum2;
         */
    }

    public int minSalesUnderAverage(long[] sales) {
        int count = 0;
        for (long sale : sales)
            if (sale < sumAverageMonth(sales))
                count ++;
        return count;
    }

    public int maxSalesAboveAverage(long[] sales) {
        int count = 0;
        for (long sale : sales)
            if (sale > sumAverageMonth(sales))
                count ++;
        return count;
    }

}