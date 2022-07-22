package com.platzi.javatests;

import org.junit.Test;

import com.platzi.javatests.util.PasswordUtil;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.HIGH;
import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.LOW;
import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.MEDIUM;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void testWeakWhenHasLessThan8Characters() {
        assertEquals(LOW, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void testMediumWhenHasMoreThan8Characters() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("12345678910"));
    }

    @Test
    public void testHighWhenHasMoreThan12Characters() {
        assertEquals(HIGH, PasswordUtil.assessPassword("1234567891011"));
    }
    
}
