package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BalanceReaderTest {

    @Test
    void read() {
        BalanceReader reader = new BalanceReader();
        BalanceData data = reader.read();

        Assertions.assertEquals(
                data.getIncomes().size(), 3);

        Assertions.assertTrue(
                data.getIncomes()
                        .contains(new BigDecimal("20000")));

        Assertions.assertEquals(
                data.getOutcomes().size(), 16);

        Assertions.assertTrue(
                data.getOutcomes()
                        .contains(new BigDecimal("126")));
    }
}