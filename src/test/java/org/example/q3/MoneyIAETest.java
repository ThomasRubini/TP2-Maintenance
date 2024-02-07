package org.example.q3;

import org.example.q23.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoneyIAETest {

    @Test
    public void testInvalidAmount() {
        assertThrows(IllegalArgumentException.class, () -> new Money(-5, "dollars"));
    }

    @Test
    public void testInvalidCurrency() {
        assertThrows(IllegalArgumentException.class, () -> new Money(5, ""));
        assertThrows(IllegalArgumentException.class, () -> new Money(5, null));
    }
}
