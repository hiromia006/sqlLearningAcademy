package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.base.BaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BaseTest {
    @FindBy(css = "ul > li a[href$='logout.htm']")
    WebElement logout;

    public DashBoardPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean hasLogoutLink() {
        GeneralUtil.waitForDomStable();
        return logout.isDisplayed();
    }
}
