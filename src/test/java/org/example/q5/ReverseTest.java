package org.example.q5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseTest {

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
        Assertions.assertEquals(expectedOut, Reverse.reverse(in));
    }

    @Test
    public void testException() {
        assertThrows(NullPointerException.class, ()-> Reverse.reverse(null));
    }
}
