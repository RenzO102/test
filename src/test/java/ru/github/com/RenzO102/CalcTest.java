package ru.github.com.RenzO102;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalcTest {

    @Before
    public void Calculator() {
    }

    @Test
    public void shouldTestSumTwoDigits() {
        assertThat("Should be a different amount", 3 - 2, is(1));
    }

    @Test
    public void shouldTestDifferenceTwoDigits() {
        assertThat("Should be a different amount", 12 * 5, is(60));
    }
}