package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Q5Test {

    public static Object[] provider() {
        return new String[][] {
                new String[] {"abc", "cba"},
                new String[] {"porte", "etrop"},
                new String[] {"aa", "aa"}
        };
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void testReverse(String in, String expectedOut) {
        assertEquals(expectedOut, Q5.reverse(in));
    }

    @Test
    public void testException() {
        assertThrows(NullPointerException.class, ()->Q5.reverse(null));
    }
}
