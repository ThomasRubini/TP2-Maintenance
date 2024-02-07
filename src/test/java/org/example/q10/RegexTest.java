package org.example.q10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RegexTest {
    @Test
    public void basicTest() {
        assertArrayEquals(new String[]{"012"}, Regex.threeDigitNumbers("012"));
    }

    @Test
    public void fourDigits() {
        assertArrayEquals(new String[]{"567"}, Regex.threeDigitNumbers("5678"));
    }

    @Test
    public void multipleMatches() {
        assertArrayEquals(new String[]{"567", "987"}, Regex.threeDigitNumbers("567a987"));
    }

    @Test
    public void multipleMatches2() {
        assertArrayEquals(new String[]{"567", "987"}, Regex.threeDigitNumbers("567987"));
    }

    @Test
    public void sameMatch() {
        assertArrayEquals(new String[]{"567", "567"}, Regex.threeDigitNumbers("567567"));
    }

    @Test
    public void noMatch() {
        assertArrayEquals(new String[]{}, Regex.threeDigitNumbers(""));
        assertArrayEquals(new String[]{}, Regex.threeDigitNumbers("01"));
        assertArrayEquals(new String[]{}, Regex.threeDigitNumbers("hello"));
    }
}
