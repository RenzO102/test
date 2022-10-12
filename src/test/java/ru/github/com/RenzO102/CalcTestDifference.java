package ru.github.com.RenzO102;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CalcTestDifference {

    @Parameterized.Parameter()
    public int t1;
    @Parameterized.Parameter(1)
    public int t2;
    @Parameterized.Parameter(2)
    public int result;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        Object[][] data = new Object[][]{{4, 2, 2}, {2, 2, 0}, {18, 10, 8}, {15, 1, 14}, {15, 3, 12}};
        return Arrays.asList(data);
    }

    @Test
    public void shouldBeTestParameterSum() {
        Calculator calc = new Calculator();
        assertThat("Should be wrong somewhere", calc.difference(t1, t2), is(result));
    }
}