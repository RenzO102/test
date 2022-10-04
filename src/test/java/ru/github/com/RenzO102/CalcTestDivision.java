package ru.github.com.RenzO102;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CalcTestDivision {

    @Parameterized.Parameter()
    public int p1;
    @Parameterized.Parameter(1)
    public int p2;
    @Parameterized.Parameter(2)
    public int result;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        Object[][] data = new Object[][]{{4, 2, 2}, {1, 1, 1}, {183, 3, 61}, {15, 5, 3}, {150, 15, 10}};
        return Arrays.asList(data);
    }

    @Test
    public void shouldBeTestParameterSum() {
        Calculator calc = new Calculator();
        assertThat("Should be wrong somewhere", calc.division(p1, p2), is(result));
    }
}