package ru.github.com.RenzO102;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DisplayName("Общее тестирвоание 2 чисел")
@Owner("Stas Simanov")
public class CalcTest {

    @Test
    @Step("3+2=5")
    @Description("Вводится два числа и проверяется их сумма")
    @DisplayName("Суммирование одного числа с другим")
    public void shouldTestSumTwoDigits() {
        Calculator calc = new Calculator();
        assertThat("Should sum of two digits", calc.sum(3, 2), is(5));
    }

    @Test
    @Step("12-5=7")
    @Description("Вводится два числа и проверяется их разность")
    @DisplayName("Вычитание из одного числа другое")
    public void shouldTestDifferenceTwoDigits() {
        Calculator calc = new Calculator();
        assertThat("Should diff of two digits", calc.difference(12, 5), is(7));
    }

    @Test
    @Step("3/3=1")
    @Description("Вводится два числа и проверяется их деление")
    @DisplayName("Деление одного числа на другое")
    public void shouldTestDivisionTwoDigits() {
        Calculator calc = new Calculator();
        assertThat("Should div of two digits", calc.division(3, 3), is(1));
    }

    @Test
    @Step("12*0=0")
    @Description("Вводится два числа и проверяется их произведение")
    @DisplayName("Умножение одного числа на другое")
    public void shouldTestMultiplicationTwoDigits() {
        Calculator calc = new Calculator();
        assertThat("Should multi of two digits", calc.multiplication(12, 0), is(0));
    }
}