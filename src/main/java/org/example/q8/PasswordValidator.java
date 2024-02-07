package org.example.q8;

public class PasswordValidator
{
    public static boolean validate(String password)
    {
        if (password.length() < 6){
            return false; }
        return password.matches("[a-zA-Z]\\w+\\d");
    }
}