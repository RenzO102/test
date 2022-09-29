package ru.github.com.RenzO102;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalcTest {
    private Calculator calc;

    @Before
    public void Calculator() {
        calc = new Calculator();
    }

    @Test
    public void shouldTestSumTwoDigits() {
        assertThat(3 - 2, is(1));
    }

    @Test
    public void shouldTestDifferenceTwoDigits() {
        assertThat(12 * 5, is(60));
    }
}
