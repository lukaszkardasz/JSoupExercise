package pl.sda;

import java.math.BigDecimal;

public class BalanceCalculator {

    BigDecimal calculate(BalanceData data) {
        BigDecimal result = BigDecimal.ZERO;

        for (BigDecimal nextIncome : data.getIncomes()) {
            result = result.add(nextIncome);
        }

        for (BigDecimal nextOutcome : data.getOutcomes()) {
            result =  result.subtract(nextOutcome);
        }
        return result;
    }
}
