package com.sqlLearningAcademy.appium.batch4.pom.pages;


import com.sqlLearningAcademy.appium.batch4.pom.BaseEmiCalculatorAppiumBatch4Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompareLoanPage extends BaseEmiCalculatorAppiumBatch4Test {
    @FindBy(id = "etLoanAmount1")
    WebElement etLoanAmount1;

    @FindBy(id = "etInterest1")
    WebElement etInterest1;

    @FindBy(id = "etPeriod1")
    WebElement etPeriod1;

    @FindBy(id = "etLoanAmount2")
    WebElement etLoanAmount2;

    @FindBy(id = "etInterest2")
    WebElement etInterest2;

    @FindBy(id = "etPeriod2")
    WebElement etPeriod2;

    @FindBy(id = "btnCalculate")
    WebElement btnCalculate;

    @FindBy(id = "btnReset") //btnReset
    WebElement btnReset;

    @FindBy(id = "monthly_emi_result_1")
    List<WebElement> totalPaymentResult1;

    public CompareLoanPage() {
        PageFactory.initElements(driver, this);
    }


    public CompareLoanPage fillLoanAmount1(int amount) {
        etLoanAmount1.isDisplayed();
        etLoanAmount1.clear();
        etLoanAmount1.sendKeys(String.valueOf(amount));
        return this;
    }

    public CompareLoanPage fillLoanInterest1(int interest) {
        etInterest1.isDisplayed();
        etInterest1.clear();
        etInterest1.sendKeys(String.valueOf(interest));
        return this;
    }

    public CompareLoanPage fillLoanPeriod1(int period) {
        etPeriod1.isDisplayed();
        etPeriod1.clear();
        etPeriod1.sendKeys(String.valueOf(period));
        return this;
    }

    public CompareLoanPage fillLoanAmount2(int amount) {
        etLoanAmount2.isDisplayed();
        etLoanAmount2.clear();
        etLoanAmount2.sendKeys(String.valueOf(amount));
        return this;
    }

    public CompareLoanPage fillLoanInterest2(int interest) {
        etInterest2.isDisplayed();
        etInterest2.clear();
        etInterest2.sendKeys(String.valueOf(interest));
        return this;
    }

    public CompareLoanPage fillLoanPeriod2(int period) {
        etPeriod2.isDisplayed();
        etPeriod2.clear();
        etPeriod2.sendKeys(String.valueOf(period));
        return this;
    }

    public CompareLoanPage tapCalculateBtn() {
        btnCalculate.isDisplayed();
        btnCalculate.click();
        return this;
    }

    public CompareLoanPage tapResetBtn() {
        btnReset.isDisplayed();
        btnReset.click();
        return this;
    }

    public boolean hasResult() {
        return totalPaymentResult1.size() > 0;
    }

}
