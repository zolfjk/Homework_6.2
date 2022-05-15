package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netologi.BonusService;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/test.csv"})
    public void test(int amount, boolean ifRegistered, int expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, ifRegistered);

        Assertions.assertEquals(expected, actual);


    }
}
