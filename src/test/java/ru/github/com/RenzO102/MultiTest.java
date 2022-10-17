package ru.github.com.RenzO102;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DisplayName("Тест умножения")
@RunWith(Parameterized.class)
public class MultiTest {

    @Parameterized.Parameter()
    public int d1;
    @Parameterized.Parameter(1)
    public int multiplied;
    @Parameterized.Parameter(2)
    public int result;

    @Parameterized.Parameters(name = " {0} * {1} = {2}")
    public static Iterable<Object[]> data() {
        Object[][] data = new Object[][]{
                {1, 2, 2},
                {2, 6, 12},
                {18, 18, 324},
                {15, 1, 15},
                {2, 2, 4}};
        return Arrays.asList(data);
    }

    @Test
    @Owner("Stas Simanov")
    @Description("Вводится два числа и проверяется их произведение")
    public void shouldBeTestParameterMulti() {
        Calculator calc = new Calculator();
        assertThat("Should multi of two digits", calc.multiplication(d1, multiplied), is(result));
    }
}