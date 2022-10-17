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

@DisplayName("Тест деления")
@RunWith(Parameterized.class)
public class DivTest {

    @Parameterized.Parameter()
    public int p1;
    @Parameterized.Parameter(1)
    public int divider;
    @Parameterized.Parameter(2)
    public int result;

    @Parameterized.Parameters(name = " {0} / {1} = {2}")
    public static Iterable<Object[]> data() {
        Object[][] data = new Object[][]{
                {4, 2, 2},
                {1, 1, 1},
                {183, 3, 61},
                {15, 5, 3},
                {150, 15, 10}};
        return Arrays.asList(data);
    }

    @Test
    @Owner("Stas Simanov")
    @Description("Вводится два числа и проверяется их деление")
    public void shouldBeTestParameterDiv() {
        Calculator calc = new Calculator();
        assertThat("Should div of two digits", calc.division(p1, divider), is(result));
    }
}