package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.base.BaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {
    @FindBy(css = "a[href$='logout.htm']")
    WebElement logoutLink;

    @FindBy(css = "a[href$='openaccount.htm']")
    WebElement openAccountLink;

    @FindBy(css = "a[href$='updateprofile.htm']")
    WebElement updateProfileLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoutLink() {
        return logoutLink.isDisplayed();
    }

    public OpenNewAccountPage clickOpenAccountLink() {
        openAccountLink.isDisplayed();
        openAccountLink.click();
        GeneralUtil.waitForDomStable();
        return new OpenNewAccountPage();
    }

    public UpdateProfilePage clickUpdateProfileLink() {
        updateProfileLink.isDisplayed();
        updateProfileLink.click();
        GeneralUtil.waitForDomStable();
        return new UpdateProfilePage();
    }
}
