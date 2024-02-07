package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

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

    public void testEquals()
    {
        Money m = new Money(5, "dollars");
        Money m2 = new Money(5, "dollars");
        assertEquals(m2, m);
    }
}
