package com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.BaseBatch5ParaBankTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends BaseBatch5ParaBankTest {
    @FindBy(css = "input.button")
    WebElement openNewAccountBtn;

    @FindBy(id = "newAccountId")
    WebElement newAccountId;

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public OpenAccountPage clickOpenNewAccountBtn() {
        openNewAccountBtn.isDisplayed();
        openNewAccountBtn.click();
        return this;
    }

    public boolean hasNewAccountId() {
        return newAccountId.isDisplayed();
    }


}
