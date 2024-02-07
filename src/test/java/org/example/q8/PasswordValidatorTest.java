package org.example.q8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {

    public static String[] validPasswordsProvider() {
        return new String[]{"abcde0", "hello1312"};
    }

    @ParameterizedTest
    @MethodSource("validPasswordsProvider")
    public void testValid(String password) {
        assertTrue(PasswordValidator.validate(password));
    }

    public static String[] invalidPasswordsProvider() {
        return new String[]{"0h", "12hello", "ubafEJYTIEeftaikuetuaeYEAThj", "76916719289701278109827281"};
    }

    @ParameterizedTest
    @MethodSource("invalidPasswordsProvider")

    public void testInvalid(String password) {
        assertFalse(PasswordValidator.validate(password));
    }
}
