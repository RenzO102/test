package ru.github.com.RenzO102.HelpDesk;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.github.com.RenzO102.SeleniumPage;

public class MainPage extends SeleniumPage {

    @FindBy(xpath = "//*[@data-test-id='next-button']")
    private WebElement nextnbutton;

    @FindBy(xpath ="//input[@type='text']" )
    private WebElement loginpass;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordpass;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement button;

    public MainPage(){
        driver.get("https://account.mail.ru/login?page=https%3A%2F%2Fe.mail.ru%2Fmessages%2Finbox&allow_external=1");
        PageFactory.initElements(driver, this);
    }

    @Step("Введение данных на сайт")
    @Attachment
    public MainPage createTicket(String emailValue, String paswordValue){
        loginpass.click();
        loginpass.sendKeys(emailValue);
        nextnbutton.click();
        passwordpass.sendKeys(paswordValue);
        button.click();
        return this;
    }
}