package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.base.BaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BaseTest {
    @FindBy(css = "ul > li a[href$='logout.htm']")
    WebElement logout;

    @FindBy(css = "ul > li a[href$='openaccount.htm']")
    WebElement openAccount;

    public DashBoardPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean hasLogoutLink() {
        GeneralUtil.waitForDomStable();
        return logout.isDisplayed();
    }

    public OpenNewAccountPage clickOpenAccount() {
        scrollToElementAndClick(openAccount);
        return new OpenNewAccountPage();
    }

}
