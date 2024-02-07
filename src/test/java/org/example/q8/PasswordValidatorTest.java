package org.example.q8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void testValid() {
        assertTrue(PasswordValidator.validate("abcde0"));
        assertTrue(PasswordValidator.validate("hello1312"));
    }
    @Test
    public void testInvalid() {
        assertFalse(PasswordValidator.validate("0h"));
        assertFalse(PasswordValidator.validate("12hello"));
        assertFalse(PasswordValidator.validate("ubafEJYTIEeftaikuetuaeYEAThj"));
        assertFalse(PasswordValidator.validate("76916719289701278109827281"));
    }
}
