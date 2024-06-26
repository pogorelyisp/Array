package ru.netology.stats;

public class StatsService {


    // общая сумма всех продаж:

    public long sumAllSales(long[] sales) {

        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    // средняя сумма продаж в месяц

    public long sumAverageSalesInMonth(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (sum + sales[i]);
        }
        return sum = sum / sales.length;
    }

    // Номер месяца, в котором был пик продаж
    public int sumMaxSalesMonth(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж, больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж
    public int sumMinSalesMonth(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж, меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1;
    }

    // Количество месяцев, в которых продажи были ниже среднего
    public int minCalcMonthBelowAverage(long[] sales) {
        int calcMinMonth = 0;
        long sumAverageSalesInMonth = sumAverageSalesInMonth(sales); // средняя сумма продаж в месяц, посчитана один раз до цикла
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sumAverageSalesInMonth) {
                calcMinMonth = calcMinMonth + 1;
            }

        }
        return calcMinMonth;
    }

    // Количество месяцев, в которых продажи были выше среднего
    public int maxCalcMonthHigherAverage(long[] sales) {
        int calcMaxMonth = 0;
        long sumAverageSalesInMonth = sumAverageSalesInMonth(sales);  // средняя сумма продаж в месяц, посчитана один раз до цикла
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sumAverageSalesInMonth(sales)) {
                calcMaxMonth = calcMaxMonth + 1;
            }
        }
        return calcMaxMonth;
    }

}


