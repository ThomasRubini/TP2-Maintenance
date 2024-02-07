package org.example.q9;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private ArrayList<Boolean> reservations;

    public BookingSystem() {
        reservations = new ArrayList<>(24);
        for (int i = 0; i < 24; i++) {
            reservations.add(Boolean.FALSE);
        }
    }

    public List<Integer> listBookedHours() {
        List<Integer> booked = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            if (reservations.get(i)) {
                booked.add(i);
            }
        }
        return booked;
    }

    public boolean reserve(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException();
        }
        if (reservations.get(hour)) {
            return false;
        } else {
            reservations.add(hour, Boolean.TRUE);
            return true;
        }
    }
}
