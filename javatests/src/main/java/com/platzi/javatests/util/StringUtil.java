package com.platzi.javatests.util;

public class StringUtil {
    public static boolean isEmpty(String str) {
        if (str.isEmpty() || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
