package ru.github.com.RenzO102;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CalcTestDifference {

    @Parameter()
    public int t1;
    @Parameter(1)
    public int subtrahend;
    @Parameter(2)
    public int result;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        Object[][] data = new Object[][]{
                {4, 2, 2},
                {2, 2, 0},
                {18, 10, 8},
                {15, 1, 14},
                {15, 3, 12}};
        return Arrays.asList(data);
    }

    @Test
    public void shouldBeTestParameterSum() {
        Calculator calc = new Calculator();
        assertThat("Should dif of two digits", calc.difference(t1, subtrahend), is(result));
    }
}