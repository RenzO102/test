package ru.github.com.RenzO102.HelpDesk;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.github.com.RenzO102.GeneralOwner;
import ru.github.com.RenzO102.SeleniumPage;

public class MainPage extends SeleniumPage {

    GeneralOwner generalOwner = ConfigFactory.create(GeneralOwner.class);
    String url = generalOwner.url();

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement nextbutton;

    @FindBy(xpath ="//*[@type='text']" )
    private WebElement login;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement secret;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement button;

    public MainPage(){
        driver.get(url);
        PageFactory.initElements(driver, this);
        }

    @Step("Введение данных на сайт")
    @Attachment
    public MainPage createTicket(String  log, String password){
        login.click();
        login.sendKeys(log);
        nextbutton.click();
        secret.sendKeys(password);
        button.click();
        return this;
    }
}