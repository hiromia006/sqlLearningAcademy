package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.base.BaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountPage extends BaseTest {
    @FindBy(id = "type")
    WebElement type;

    @FindBy(id = "fromAccountId")
    WebElement accountId;

    @FindBy(css = "input.button")
    WebElement btn;

    @FindBy(id = "newAccountId")
    WebElement newAccountId;

    public OpenNewAccountPage() {
        PageFactory.initElements(driver, this);

    }

    public OpenNewAccountPage selectAccountType(int index) {
        new Select(type)
                .selectByIndex(index);
        return this;
    }

    public OpenNewAccountPage selectAccountType(String value) {
        new Select(type)
                .selectByValue(value);
        return this;
    }

    public OpenNewAccountPage selectAmount(int index) {
        GeneralUtil.waitForDomStable();
        new Select(accountId)
                .selectByIndex(index);
        return this;
    }

    public OpenNewAccountPage selectAmount(String value) {
        new Select(accountId)
                .selectByValue(value);
        return this;
    }

    public OpenNewAccountPage clickNewAccountBtn() {
        btn.isDisplayed();
        btn.click();
        return this;
    }

    public boolean hasAccountId() {
        return newAccountId.isDisplayed();
    }
}
