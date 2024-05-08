package ru.netology.stats;

public class Main {
    public static void main(String[] args) {


        StatsService summ = new StatsService();

        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        // общая сумма всех продаж:

        int amaunt = summ.sumAllSales(sales);

        System.out.println("Общая сумма всех продаж " + amaunt);

        // средняя сумма продаж в месяц

        int Average = summ.sumAverageSalesInMonth(sales);

        System.out.println("Средняя сумма продаж в месяц " + Average);

        // Номер месяца, в котором был пик продаж

        int maxMonth = summ.sumMaxSalesMonth(sales);

        System.out.println("Номер месяца, в котором был пик продаж " + maxMonth);

        // Номер месяца, в котором был минимум продаж
        int minMonth = summ.sumMinSalesMonth(sales);
        System.out.println("Номер месяца, в котором был минимум продаж " + minMonth);

        // Количество месяцев, в которых продажи были ниже среднего
        int calcMinMonth = summ.minCalcMonthBelowAverage(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего " + calcMinMonth);

        // Количество месяцев, в которых продажи были выше среднего
        int calcMaxMonth = summ.maxCalcMonthHigherAverage(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего " + calcMaxMonth);

    }
}

