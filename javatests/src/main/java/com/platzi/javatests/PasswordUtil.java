package com.platzi.javatests;

public class PasswordUtil {

    public enum SecurityLevel {
        LOW, MEDIUM, HIGH
    }
    
    public static SecurityLevel assessPassword(String password) {
        if (password.length() < 8) {
            return SecurityLevel.LOW;
        } else if (password.length() < 12) {
            return SecurityLevel.MEDIUM;
        } else {
            return SecurityLevel.HIGH;
        }
    }
}
