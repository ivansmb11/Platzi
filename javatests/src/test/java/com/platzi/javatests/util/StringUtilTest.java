package com.platzi.javatests.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilTest {
    
    @Test
    public void testIsEmptyFalse() {
        assertFalse(StringUtil.isEmpty("hola"));
    }

    @Test
    public void testIsEmptyTrue() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void testIsEmptyTrueSpaceses() {
        assertTrue(StringUtil.isEmpty(" "));
    }
    
}
