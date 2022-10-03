package ru.github.com.RenzO102;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CalcBasicTest {
    @Parameterized.Parameter()
    public int firstSummand;
    @Parameterized.Parameter(1)
    public int secondSummand;
    @Parameterized.Parameter(2)
    public int sum;

    @Parameterized.Parameters(name = "{index}: {0} + {1} = {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{{1, 2, 3}, {2, 6, 8}, {18, 18, 36}, {15, 1, 16}, {15, 3, 18}});
    }

    @Test
    public void shouldBeTestParameterSum() {
        assertThat("Should be a different amount", firstSummand + secondSummand, is(sum));
    }
}