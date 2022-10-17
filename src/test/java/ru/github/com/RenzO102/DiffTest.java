package ru.github.com.RenzO102;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DisplayName("Тест разницы")
@RunWith(Parameterized.class)
public class DiffTest{

    @Parameter()
    public int t1;
    @Parameter(1)
    public int subtrahend;
    @Parameter(2)
    public int result;

    @Parameterized.Parameters(name = "{0} - {1} = {2}")
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
    @Owner("Stas Simanov")
    @Description("Вводится два числа и проверяется их разница")
    public void shouldBeTestParameterSum() {
        Calculator calc = new Calculator();
        assertThat("Should diff of two digits", calc.difference(t1, subtrahend), is(result));
    }
}