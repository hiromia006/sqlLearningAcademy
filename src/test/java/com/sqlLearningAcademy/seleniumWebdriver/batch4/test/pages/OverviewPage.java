package com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages;


import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.baseTest.BaseSeleniumBatch4Test;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.util.GeneralSeleniumBatchFour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends BaseSeleniumBatch4Test {
    @FindBy(css = "a[href*='logout']")
    WebElement logoutLink;

    @FindBy(css = "a[href*='openaccount']")
    WebElement openAccountLink;

    @FindBy(css = "a[href*='updateprofile']")
    WebElement updateProfileLink;



    public OverviewPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoutLink() {
        return logoutLink.isDisplayed();
    }

    public OpenAccountPage clickOpenAccountLink() {
        GeneralSeleniumBatchFour.domStable();
        openAccountLink.isDisplayed();
        openAccountLink.click();
        return new OpenAccountPage();
    }

    public UpdateProfilePage clickUpdateProfileLink() {
        GeneralSeleniumBatchFour.domStable();
        updateProfileLink.isDisplayed();
        updateProfileLink.click();
        return new UpdateProfilePage();
    }

}
