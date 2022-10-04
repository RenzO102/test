package ru.github.com.RenzO102;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CalcTestSum {

    @Parameterized.Parameter()
    public int f1;
    @Parameterized.Parameter(1)
    public int f2;
    @Parameterized.Parameter(2)
    public int result;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        Object[][] data = new Object[][]{{1, 2, 3}, {2, 6, 8}, {18, 18, 36}, {15, 1, 16}, {15, 3, 18}};
        return Arrays.asList(data);
    }

    @Test
    public void shouldBeTestParameterSum() {
        Calculator calc = new Calculator();
        assertThat("Should be wrong somewhere", calc.sum(f1, f2), is(result));
    }
}