package org.example.q6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FahrenheitCelciusConverterTest {
    public static Object[] provider1() {
        return new Object[]{
                new Object[]{32, 0},
                new Object[]{98, 37},
                new Object[]{212, 100}
        };
    }

    @ParameterizedTest
    @MethodSource("provider1")
    public void testAmountAndCurrency(int expected, int celcius) {
        assertEquals(expected, FahrenheitCelciusConverter.toFahrenheit(celcius));
    }

    public static Object[] provider2() {
        return new Object[]{
                new Object[]{0, 32},
                new Object[]{37, 100},
                new Object[]{100, 212}
        };
    }
}