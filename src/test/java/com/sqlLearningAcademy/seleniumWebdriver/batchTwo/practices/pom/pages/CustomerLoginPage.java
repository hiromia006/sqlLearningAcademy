package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.base.BaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends BaseTest {
    @FindBy(css = "input[name='username']")
    WebElement usernameEl;

    @FindBy(css = "input[name='password']")
    WebElement passwordEl;

    @FindBy(css = "form input.button")
    WebElement loginBtn;

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public DashBoardPage login(String username, String password) {
        usernameEl.isDisplayed();
        usernameEl.clear();
        usernameEl.sendKeys(username);

        passwordEl.clear();
        passwordEl.sendKeys(password);

        loginBtn.isDisplayed();
        loginBtn.click();

        GeneralUtil.waitForDomStable();
        return new DashBoardPage();
    }


}
