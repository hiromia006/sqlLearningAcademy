package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameEl;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordEl;

    @CacheLookup
    @FindBy(css = "input.button")
    WebElement loginBtn;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String username, String password) {
        usernameEl.isDisplayed();
        usernameEl.sendKeys(username);

        passwordEl.sendKeys(password);
        loginBtn.click();
        return new HomePage();
    }


}
