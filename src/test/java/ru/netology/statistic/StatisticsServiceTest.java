package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {
    private final StatisticsService service = new StatisticsService();

    @Test
    void shouldFindMaxWhenMaxAtBeginning() {
        // Покрывает ветку: false (все элементы ≤ первого)
        long[] incomes = {15, 12, 5, 8};
        assertEquals(15, service.findMax(incomes));
    }

    @Test
    void shouldFindMaxWhenMaxAtEnd() {
        // Покрывает ветку: true (последний элемент > текущего максимума)
        long[] incomes = {5, 8, 4, 15};
        assertEquals(15, service.findMax(incomes));
    }
}