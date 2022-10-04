package ru.github.com.RenzO102;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CalcTestMultiplication {

    @Parameterized.Parameter()
    public int d1;
    @Parameterized.Parameter(1)
    public int d2;
    @Parameterized.Parameter(2)
    public int result;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        Object[][] data = new Object[][]{{1, 2, 2}, {2, 6, 12}, {18, 18, 324}, {15, 1, 15}, {15, 0, 0}};
        return Arrays.asList(data);
    }

    @Test
    public void shouldBeTestParameterSum() {
        Calculator calc = new Calculator();
        assertThat("Should be wrong somewhere", calc.multiplication(d1, d2), is(result));
    }
}