package ru.github.com.RenzO102.HelpDesk;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Test;
import ru.github.com.RenzO102.GeneralOwner;
import ru.github.com.RenzO102.WebDriverInic;

@DisplayName("Проверка ввода даных на сайт")
public class HelpTest extends WebDriverInic {

    GeneralOwner generalOwner = ConfigFactory.create(GeneralOwner.class);
    String email = generalOwner.email();
    String password = generalOwner.password();

    @Test
    @DisplayName("Ввод переменных")
    @Description("Принимает значения логина и пароля . Вводит их в соответвующие поля ")
    public void checkTicket() {
        MainPage mainPage = new MainPage();
        mainPage.createTicket(email, password);
    }
}