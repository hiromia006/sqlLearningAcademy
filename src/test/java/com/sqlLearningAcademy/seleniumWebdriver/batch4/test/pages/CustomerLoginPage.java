package com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages;


import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.baseTest.BaseSeleniumBatch4Test;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.util.GeneralSeleniumBatchFour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends BaseSeleniumBatch4Test {
    @FindBy(how = How.NAME, using = "username")
    WebElement usernameEl;

    @FindBy(name = "password")
    WebElement passwordEl;

    @FindBy(css = ".login .button")
    WebElement loginBtn;

    @FindBy(className = "error")
    WebElement errorEl;

    @FindBy(css = "a[href*='register']")
    WebElement registerLink;

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public CustomerLoginPage fillUsername(String username) {
        usernameEl.isDisplayed();
        usernameEl.clear();
        usernameEl.sendKeys(username);
        return this;
    }

    public CustomerLoginPage fillPassword(String password) {
        passwordEl.isDisplayed();
        passwordEl.clear();
        passwordEl.sendKeys(password);
        return this;
    }

    public OverviewPage clickLoginBtn() {
        loginBtn.isDisplayed();
        loginBtn.click();
        return new OverviewPage();
    }

    public CustomerLoginPage clickLoginBtn2() {
        loginBtn.isDisplayed();
        loginBtn.click();
        return this;
    }


    public OverviewPage login(String username, String password) {
        fillUsername(username);
        fillPassword(password);
        clickLoginBtn();
        GeneralSeleniumBatchFour.domStable();
        return new OverviewPage();
    }

    public CustomerLoginPage login(String username) {
        fillUsername(username);
        clickLoginBtn();
        return this;
    }

    public boolean hasError() {
        return errorEl.isDisplayed();
    }

    public RegisterPage clickRegisterLink() {
        registerLink.isDisplayed();
        registerLink.click();
        return new RegisterPage();
    }

}
