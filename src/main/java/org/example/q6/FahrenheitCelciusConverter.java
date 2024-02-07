package org.example.q6;

public class FahrenheitCelciusConverter {

    public static int toFahrenheit(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static int toCelcius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
