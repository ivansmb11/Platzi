package com.platzi.javatests.fizzbuzz;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        assertThat(FizzBuzz.fizzBuzz(3), CoreMatchers.is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(5), CoreMatchers.is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(15), CoreMatchers.is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(1), CoreMatchers.is("1"));
    }
}
