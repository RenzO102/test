package ru.github.com.RenzO102;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalcTest {

    @Test
    public void shouldTestSumTwoDigits() {
        Calculator calc = new Calculator();
        assertThat("Should sum of two digits", calc.sum(3, 2), is(5));
    }

    @Test
    public void shouldTestDifferenceTwoDigits() {
        Calculator calc = new Calculator();
        assertThat("Should diff of two digits", calc.difference(12, 5), is(7));
    }

    @Test
    public void shouldTestDivisionTwoDigits() {
        Calculator calc = new Calculator();
        assertThat("Should div of two digits", calc.division(3, 3), is(1));
    }

    @Test
    public void shouldTestMultiplicationTwoDigits() {
        Calculator calc = new Calculator();
        assertThat("Should multi of two digits", calc.multiplication(12, 0), is(0));
    }
}