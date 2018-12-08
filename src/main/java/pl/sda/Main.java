package pl.sda;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws IOException, InvalidFormatException {

        BalanceReader reader = new BalanceReader();
        BalanceCalculator calculator = new BalanceCalculator();

        BalanceData data = reader.read();
        BigDecimal balance = calculator.calculate(data);
        System.out.println("Saldo wynosi: " + balance);
    }
}
