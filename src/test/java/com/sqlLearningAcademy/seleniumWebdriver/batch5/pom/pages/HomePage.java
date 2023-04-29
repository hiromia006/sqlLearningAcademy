package com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.BaseBatch5ParaBankTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseBatch5ParaBankTest {
    @FindBy(linkText = "Log Out")
    WebElement logoutText;

    @FindBy(linkText = "Open New Account")
    WebElement openAccountLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public OpenAccountPage clickOpenAccountLink() {
        openAccountLink.isDisplayed();
        openAccountLink.click();
        return new OpenAccountPage();
    }

    public boolean isLogOutText() {
        return logoutText.isDisplayed();
    }
}
