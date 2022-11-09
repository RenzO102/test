package ru.github.com.RenzO102.HelpDesk;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.github.com.RenzO102.GeneralOwner;
import ru.github.com.RenzO102.WebDriverInic;

import static org.hamcrest.CoreMatchers.is;

@DisplayName("Проверка ввода даных на сайт")
public class HelpTest extends WebDriverInic {

        GeneralOwner generalOwner = ConfigFactory.create(GeneralOwner.class);

        @Test
        @DisplayName("Ввод переменных")
        @Description("Принимает значения логина и пароля . Вводит их в соответвующие поля ")
        public void shouldTestCheckLogin() {
                driver.get(generalOwner.Url());
                driver.findElement(By.xpath("//input[@id='passp-field-login']")).sendKeys(generalOwner.email());
                driver.findElement(By.xpath("//button[@id='passp:sign-in']")).click();
                driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys(generalOwner.password());
                driver.findElement(By.xpath("//button[@id='passp:sign-in']")).click();
                String getError = driver.findElement(By.xpath("//div[@id='field:input-passwd:hint']")).getText();
                        Assert.assertThat(getError, is("Неверный пароль"));
        }
}