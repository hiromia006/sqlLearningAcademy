package com.sqlLearningAcademy.appium.batch5.pom.pages;

import com.sqlLearningAcademy.appium.batch5.pom.BaseAppiumBatch5Test;
import com.sqlLearningAcademy.appium.batch5.pom.util.General;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;


public class CompareLoanPage extends BaseAppiumBatch5Test {
    @CacheLookup
    @AndroidBy(id = "etLoanAmount1")
    WebElement etLoanAmount1;

    @AndroidBy(id = "etInterest1")
    WebElement etInterest1;

    @AndroidBy(id = "etPeriod1")
    WebElement etPeriod1;

    @AndroidBy(id = "etLoanAmount2")
    WebElement etLoanAmount2;

    @AndroidBy(id = "etInterest2")
    WebElement etInterest2;

    @AndroidBy(id = "etPeriod2")
    WebElement etPeriod2;

    @AndroidBy(id = "btnCalculate")
    WebElement btnCalculate;

    @AndroidBy(id = "btnReset")
    WebElement btnReset;

    //layoutTable
    @AndroidBy(id = "layoutTable")
    List<WebElement> layoutTable;

    public CompareLoanPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(General.WAIT_TIME)), this);
    }

    public CompareLoanPage fillLoanAmount1(int loanAmount) {
        etLoanAmount1.isDisplayed();
        etLoanAmount1.clear();
        etLoanAmount1.sendKeys(String.valueOf(loanAmount));
        return this;
    }

    public CompareLoanPage fillInterest1(int interest) {
        etInterest1.isDisplayed();
        etInterest1.clear();
        etInterest1.sendKeys(String.valueOf(interest));
        return this;
    }

    public CompareLoanPage fillPeriod1(int period) {
        etPeriod1.isDisplayed();
        etPeriod1.clear();
        etPeriod1.sendKeys(String.valueOf(period));
        return this;
    }

    public CompareLoanPage fillLoanAmount2(int loanAmount) {
        etLoanAmount2.isDisplayed();
        etLoanAmount2.clear();
        etLoanAmount2.sendKeys(String.valueOf(loanAmount));
        return this;
    }

    public CompareLoanPage fillInterest2(int interest) {
        etInterest2.isDisplayed();
        etInterest2.clear();
        etInterest2.sendKeys(String.valueOf(interest));
        return this;
    }

    public CompareLoanPage fillPeriod2(int period) {
        etPeriod2.isDisplayed();
        etPeriod2.clear();
        etPeriod2.sendKeys(String.valueOf(period));
        return this;
    }

    public CompareLoanPage tapBtnCalculate() {
        btnCalculate.isDisplayed();
        btnCalculate.click();
        return this;
    }

    public CompareLoanPage tapBtnReset() {
        btnReset.isDisplayed();
        btnReset.click();
        return this;
    }

    public boolean hasLayoutTable() {
        return layoutTable.size() > 0;
    }
}
