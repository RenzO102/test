package ru.github.com.RenzO102.HelpDesk;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import ru.github.com.RenzO102.WebTest;

@DisplayName("Проверка ввода даных на сайт")
public class HelpTest extends WebTest {

    @Test
    @DisplayName("Ввод переменных")
    @Description("Принимает значения логина и пароля . Вводит их в соответвующие поля allure serve target/allure-result\n")
    public void checkTicket(){
                String email = "stson102@mail.ru";
                String password = "Omon9751";
                MainPage mainPage = new MainPage();
                mainPage.createTicket(email, password);
    }
}
