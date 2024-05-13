import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void sumAllSales() {                                       // общая сумма всех продаж
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // продажи по месяцам
        int expectedSales = 180;                                      // общая сумма всех продаж
        long allSum = service.sumAllSales(sales);

        Assertions.assertEquals(expectedSales, allSum);
    }


    @Test
    public void sumAverageSalesInMonth() {                               // средняя сумма продаж в месяц
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};    // продажи по месяцам
        int expectedSumAverageSalesInMonth = 15;                        // средняя сумма продаж в месяц
        long Average = service.sumAverageSalesInMonth(sales);

        Assertions.assertEquals(expectedSumAverageSalesInMonth, Average);


    }

    @Test
    public void sumMaxSalesMonth() {                                   // Номер месяца, в котором был пик продаж
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // продажи по месяцам
        int expectedSumMaxSalesMonth = 8;                             // Номер месяца, в котором был пик продаж
        long SumMaxSalesMonth = service.sumMaxSalesMonth(sales);

        Assertions.assertEquals(expectedSumMaxSalesMonth, SumMaxSalesMonth);

    }

    @Test
    public void sumMinSalesMonth() {                                    // Номер месяца, в котором был минимум продаж
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   // продажи по месяцам
        int expectedSumMinSalesMonth = 9;                              // Номер месяца, в котором был минимум продаж
        long sumMinSalesMonth = service.sumMinSalesMonth(sales);

        Assertions.assertEquals(expectedSumMinSalesMonth, sumMinSalesMonth);


    }

    @Test
    public void minCalcMonthBelowAverage() {                             // Количество месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};    // продажи по месяцам
        int expectedMinCalcMonthBelowAverage = 5;                       // Количество месяцев, в которых продажи были ниже среднего
        long minCalcMonthBelowAverage = service.minCalcMonthBelowAverage(sales);

        Assertions.assertEquals(expectedMinCalcMonthBelowAverage, minCalcMonthBelowAverage);


    }

    @Test
    public void maxCalcMonthHigherAverage() {                               // Количество месяцев, в которых продажи были выше среднего
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};       // продажи по месяцам
        int expectedMaxCalcMonthHigherAverage = 5;                          // Количество месяцев, в которых продажи были выше среднего
        long maxCalcMonthHigherAverage = service.maxCalcMonthHigherAverage(sales);

        Assertions.assertEquals(expectedMaxCalcMonthHigherAverage, maxCalcMonthHigherAverage);

    }
}

