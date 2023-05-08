package com.sqlLearningAcademy.appium.batch5.pom.pages;

import com.sqlLearningAcademy.appium.batch5.pom.BaseAppiumBatch5Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseAppiumBatch5Test {
    @FindBy(id = "btnStart")
    WebElement btnStart;

    @FindBy(id = "btnCompare")
    WebElement btnCompare;

    public LandingPage() {
        PageFactory.initElements(driver, this);
    }

    public EmiCalculatorPage tabEmilCalculatorBtn() {
        btnStart.isDisplayed();
        btnStart.click();
        return new EmiCalculatorPage();
    }

    public CompareLoanPage tabCompareLoansBtn() {
        btnCompare.isDisplayed();
        btnCompare.click();
        return new CompareLoanPage();

    }

    public boolean isEmilCalculatorBtn() {
        return btnStart.isDisplayed();
    }

    public boolean isCompareLoansBtn() {
        return btnCompare.isDisplayed();
    }


}
