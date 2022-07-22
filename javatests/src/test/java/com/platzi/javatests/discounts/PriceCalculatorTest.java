package com.platzi.javatests.discounts;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class PriceCalculatorTest {

    @Test
    public void testTotal0WhenThereAreNoItems() {
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), CoreMatchers.is(0.0));
    }

    @Test
    public void testTotalIsTheSumofItems() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10.0);
        calculator.addPrice(20.0);

        assertThat(calculator.getTotal(), CoreMatchers.is(30.0));
    }

    @Test
    public void testTotalIsTheSumofItemsMinusDiscount() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10.0);
        calculator.addPrice(20.0);

        calculator.setDiscount(25);

        assertThat(calculator.getTotal(), CoreMatchers.is(22.5));
    }
}
