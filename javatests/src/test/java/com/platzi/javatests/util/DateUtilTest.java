package com.platzi.javatests.util;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class DateUtilTest {

    @Test
    public void testIsLeapYearDivisibleBy400() {
        assertThat(DateUtil.isLeapYear(1600), CoreMatchers.is(true));
    }

    @Test
    public void testIsLeapYearFalseDivisibleBy100ButNot400() {
        assertThat(DateUtil.isLeapYear(1700), CoreMatchers.is(false));
    }

    @Test
    public void testIsLeapYearTrueDivisibleBy4ButNot100() {
        assertThat(DateUtil.isLeapYear(2012), CoreMatchers.is(true));
    }

    @Test
    public void testIsNotLeapYearNotDivisibleBy4() {
        assertThat(DateUtil.isLeapYear(2013), CoreMatchers.is(false));
    }

}
