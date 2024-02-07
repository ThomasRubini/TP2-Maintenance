package org.example.q2;

import org.example.q23.Money;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class MoneyTest {
    public static Object[] moneyProvider() {
        return new Object[]{
                new Object[]{10, "USD"},
                new Object[]{20, "EUR"}
        };
    }

    @ParameterizedTest
    @MethodSource("moneyProvider")
    public void testAmountAndCurrency(int amount, String currency) {
        Money m = new Money(amount, currency);
        assertEquals(currency, m.getCurrency());
        assertEquals(amount, m.getAmount());
    }

    @Test
    public void testEquals() {
        Money m = new Money(5, "dollars");
        Money m2 = new Money(5, "dollars");
        assertEquals(m2, m);
    }
}
