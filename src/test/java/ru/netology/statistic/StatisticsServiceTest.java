package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMaxWhenMaxAtBeginning() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {15, 12, 5, 8, 4}; // максимум в начале
        long expected = 15;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findMaxWhenMaxAtEnd() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 8, 4, 15};
        long expected = 15;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findMaxWithSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {42};
        long expected = 42;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findMaxWithAllEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7, 7, 7, 7};
        long expected = 7;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findMaxWithNegativeNumbers() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-5, -2, -10, -1};
        long expected = -1;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);

    }
}