package com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.base.ParaBankBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends ParaBankBaseTest {
    @FindBy(css = "a[href$='logout.htm']")
    List<WebElement> logoutLink;

    @FindBy(css = "a[href$='openaccount.htm']")
    WebElement openAccountBtn;

    @FindBy(css = "a[href$='transfer.htm']")
    WebElement transferBtn;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoutLink() {
        return logoutLink.size() > 0;
    }

    public OpenAccountPage clickOpenAccountLink() {
        openAccountBtn.isDisplayed();
        openAccountBtn.click();
        return new OpenAccountPage();
    }

    public TransferFundsPage clickTransferLink() {
        transferBtn.isDisplayed();
        transferBtn.click();
        return new TransferFundsPage();
    }
}
