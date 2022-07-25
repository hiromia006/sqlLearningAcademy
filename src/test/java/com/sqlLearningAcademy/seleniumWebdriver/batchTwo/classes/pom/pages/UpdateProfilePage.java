package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfilePage extends BaseTest {
    @FindBy(id = "customer.firstName")
    WebElement fistNameEl;

    @FindBy(id = "customer.lastName")
    WebElement lastNameEl;

    @FindBy(css = "input.button")
    WebElement btn;

    public UpdateProfilePage() {
        PageFactory.initElements(driver, this);
    }

    public UpdateProfilePage fillFirstName(String fistName) {
        fistNameEl.isDisplayed();
        fistNameEl.sendKeys(fistName);
        return this;
    }

    public UpdateProfilePage fillLastName(String lastName) {
        lastNameEl.isDisplayed();
        lastNameEl.sendKeys(lastName);
        return this;
    }

    public UpdateProfilePage clickUpdateProfileBtn() {
        btn.isDisplayed();
        btn.click();
        return this;
    }


}
