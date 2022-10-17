package ru.github.com.RenzO102;

import io.qameta.allure.Step;


public class Calculator {

    @Step("Сложение {a} и {b}")
    public int sum(int a, int b) {
        return a + b;
    }

    @Step("Разницы {a} и {b}")
    public int difference(int a, int b) {
        return a - b;
    }

    @Step("Умножение {a} на {b}")
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Step("Деление {a} на {b}")
    public int division(int a, int b) {
        return a / b;
    }
}