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

@DisplayName("Тест сложения")
@RunWith(Parameterized.class)
public class SumTest {

    @Parameter()
    public int number1;
    @Parameter(1)
    public int summable;
    @Parameter(2)
    public int result;

    @Parameterized.Parameters(name = "{0} + {1} = {2}")
    public static Iterable<Object[]> data() {
        Object[][] data = new Object[][]{
                {1, 2, 3},
                {2, 6, 8},
                {18, 18, 36},
                {15, 1, 16},
                {1, 1, 2}};
        return Arrays.asList(data);
    }

    @Test
    @Owner("Stas Simanov")
    @Description("Вводится два числа и проверяется их сумма")
    public void shouldBeTestParameterSum() {
        Calculator calc = new Calculator();
        assertThat("Should sum of two digits", calc.sum(number1, summable), is(result));
    }
}