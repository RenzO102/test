package ru.github.com.RenzO102;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CalcBasicTest {
    private static java.util.Arrays Arrays;
@Parameterized.Parameters(name = "{index}: {0} + {1} = {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 2, 3},
                {2, 6, 8},
                {18, 18, 36},
                {15, 1, 16},
                {15, 3, 18},
        });
    }

    @Parameterized.Parameter(0)
    public int firstSummand;

    @Parameterized.Parameter(1)
    public int secondSummand;

    @Parameterized.Parameter(2)
    public int sum;

    @Before
    public void initCalculator() {

    }

    @Test
    public void shouldBeTestParameterSum() {
        assertThat("Should be a different amount",firstSummand + secondSummand,is(sum));
    }

    @Test
    public void shouldBeTestParameterSubtraction() {
        assertThat(sum - firstSummand,is(secondSummand));
    }
}