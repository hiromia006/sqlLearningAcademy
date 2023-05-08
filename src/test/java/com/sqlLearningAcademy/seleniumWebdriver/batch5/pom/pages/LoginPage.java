package com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.BaseBatch5ParaBankTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseBatch5ParaBankTest {
    @FindBy(name = "username")
    WebElement usernameEl;

    @FindBy(name = "password")
    WebElement passwordEl;

    @FindBy(css = "input.button")
    WebElement loginBtn;

    @FindBy(linkText = "Register")
    WebElement registerLink;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public LoginPage fillUsername(String username) {
        usernameEl.isDisplayed();
        usernameEl.clear();
        usernameEl.sendKeys(username);
        return this;
    }

    public LoginPage fillPassword(String password) {
        passwordEl.isDisplayed();
        passwordEl.clear();
        passwordEl.sendKeys(password);
        return this;
    }

    public HomePage clickLoginBtn() {
        loginBtn.isDisplayed();
        loginBtn.click();
        return new HomePage();
    }

    public RegisterPage clickRegisterLinkBtn() {
        registerLink.isDisplayed();
        registerLink.click();
        return new RegisterPage();
    }
}
