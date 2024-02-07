package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
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

    public void testInvalidAmount()
    {
        Assert.assertThrows(IllegalArgumentException.class, ()-> new Money(-5, "dollars"));
    }

    public void testInvalidCurrency()
    {
        Assert.assertThrows(IllegalArgumentException.class, ()-> new Money(5, ""));
        Assert.assertThrows(IllegalArgumentException.class, ()-> new Money(5, null));
    }

    public void testEquals()
    {
        Money m = new Money(5, "dollars");
        Money m2 = new Money(5, "dollars");
        assertEquals(m2, m);
    }
}
