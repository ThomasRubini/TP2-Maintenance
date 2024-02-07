package org.example.q9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class BookingSystemTest {

    BookingSystem system;

    @BeforeEach
    public void init() {
        system = new BookingSystem();
    }

    @Test
    public void testEmptyBooking() {
        assertEquals(0, system.listBookedHours().size());
    }

    @Test
    public void testReserve() {
        system.reserve(8);
        system.reserve(4);
        assertEquals(system.listBookedHours(), Arrays.asList(4, 8));
    }

    @Test
    public void testReserveTwice() {
        assertTrue(system.reserve(4));
        assertFalse(system.reserve(4));
        assertEquals(system.listBookedHours(), Collections.singletonList(4));
    }
    @Test
    public void testInvalidHour() {
        assertThrows(IllegalArgumentException.class, () -> system.reserve(-1));
        assertThrows(IllegalArgumentException.class, () -> system.reserve(24));
    }
}
