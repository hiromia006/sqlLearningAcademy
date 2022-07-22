package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OpenNewAccountPage extends BaseTest {
    @FindBy(id = "type")
    WebElement accountType;

    @FindBy(id = "fromAccountId")
    WebElement fromAccountId;

    @FindBy(css = "form input.button")
    WebElement newAccountBtn;

    @FindBy(id = "newAccountId")
    List<WebElement> accountId;

    public OpenNewAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public OpenNewAccountPage selectAccountType(int index) {
        new Select(accountType)
                .selectByIndex(index);
        return this;
    }

    public OpenNewAccountPage selectAccountType(String value) {
        new Select(accountType)
                .selectByValue(value);
        return this;
    }

    public OpenNewAccountPage selectFromAccountId(int index) {
        new Select(fromAccountId)
                .selectByIndex(index);
        return this;
    }

    public OpenNewAccountPage selectFromAccountId(String value) {
        new Select(fromAccountId)
                .selectByValue(value);
        return this;
    }

    public OpenNewAccountPage clickCreateAccount() {
        scrollToElementAndClick(newAccountBtn);
        return this;
    }

    public boolean hasNewAccountId() {
        return accountId.size() > 0;
    }

}
