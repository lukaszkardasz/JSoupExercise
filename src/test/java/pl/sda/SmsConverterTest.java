package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SmsConverterTest {

    @ParameterizedTest
    @MethodSource("getData")
    public void testConvert(String message, String expectedMessage) {
        SmsConverter converter = new SmsConverter();
        String result = converter.convert(message);
        Assertions.assertEquals(expectedMessage, result);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("Babcia poszła po rente",
                        "BabciaPoszłaPoRente"),
                Arguments.of(
                        "Ala i Monika poszły do kina",
                        "AlaIMonikaPoszłyDoKina"
                ),
                Arguments.of("Kasia", "Kasia")

        );
    }
}