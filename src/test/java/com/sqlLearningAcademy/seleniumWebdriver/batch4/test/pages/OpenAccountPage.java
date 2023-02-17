package com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages;


import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.baseTest.BaseSeleniumBatch4Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends BaseSeleniumBatch4Test {
    @FindBy(className = "button")
    WebElement openAccountBtn;

    @FindBy(id = "newAccountId")
    WebElement newAccountId;

    @FindBy(css = "a[href*='logout']")
    WebElement logoutLink;

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public OpenAccountPage clickOpenAccountBtn() {
        driver.navigate().refresh();
        openAccountBtn.isDisplayed();
        openAccountBtn.click();
        return this;
    }

    public boolean hasNewAccountId() {
        return newAccountId.isDisplayed();
    }

    public CustomerLoginPage clickLogOutBtn() {
        logoutLink.isDisplayed();
        logoutLink.click();
        return new CustomerLoginPage();
    }

}
