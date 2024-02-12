package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class JobRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")

    public void calculate(int income, int expenses,int threshold, int expected) {
        JobRestService service = new JobRestService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}
