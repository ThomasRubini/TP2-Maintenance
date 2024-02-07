package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    // Q2
    public static Object[] moneyProvider() {
        return new Object[] {
                new Object[] {10, "USD"},
                new Object[] {20, "EUR"}
        };
    }

    @ParameterizedTest
    @MethodSource("moneyProvider")
    public void testAmountAndCurrency(int amount, String currency)
    {
        Money m = new Money(amount, currency);
        assertEquals(currency, m.getCurrency());
        assertEquals(amount, m.getAmount());
    }

    // Q3
    @Test
    public void testInvalidAmount()
    {
        assertThrows(IllegalArgumentException.class, ()-> new Money(-5, "dollars"));
    }

    @Test
    public void testInvalidCurrency()
    {
        assertThrows(IllegalArgumentException.class, ()-> new Money(5, ""));
        assertThrows(IllegalArgumentException.class, ()-> new Money(5, null));
    }

    @Test
    public void testEquals()
    {
        Money m = new Money(5, "dollars");
        Money m2 = new Money(5, "dollars");
        assertEquals(m2, m);
    }
}
