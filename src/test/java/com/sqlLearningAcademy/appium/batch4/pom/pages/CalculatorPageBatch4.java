package com.sqlLearningAcademy.appium.batch4.pom.pages;


import com.sqlLearningAcademy.appium.batch4.pom.BaseEmiCalculatorAppiumBatch4Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPageBatch4 extends BaseEmiCalculatorAppiumBatch4Test {
    @FindBy(id = "etLoanAmount")
    WebElement etLoanAmount;

    @FindBy(id = "etInterest")
    WebElement etInterest;

    @FindBy(id = "etYears")
    WebElement etYears;

    @FindBy(id = "etMonths")
    WebElement etMonths;

    @FindBy(id = "etFee")
    WebElement etFee;

    @FindBy(id = "btnCalculate")
    WebElement btnCalculate;

    @FindBy(id = "btnReset")
    WebElement btnReset;

    @FindBy(id = "btnDetail")
    WebElement btnDetail;

    public CalculatorPageBatch4() {
//        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(General.TIME_OUT)), this);
        PageFactory.initElements(driver, this);
    }

    public CalculatorPageBatch4 fillLoanAmount(int amount) {
        etLoanAmount.isDisplayed();
        etLoanAmount.clear();
        etLoanAmount.sendKeys(String.valueOf(amount));
        return this;
    }

    public CalculatorPageBatch4 fillInterestPercentage(int interest) {
        etInterest.isDisplayed();
        etInterest.clear();
        etInterest.sendKeys(String.valueOf(interest));
        return this;
    }


    public CalculatorPageBatch4 fillYear(int year) {
        etYears.isDisplayed();
        etYears.clear();
        etYears.sendKeys(String.valueOf(year));
        return this;
    }

    public CalculatorPageBatch4 fillMonth(int months) {
        etMonths.isDisplayed();
        etMonths.clear();
        etMonths.sendKeys(String.valueOf(months));
        return this;
    }

    public CalculatorPageBatch4 fillProcessFee(int fee) {
        etFee.isDisplayed();
        etFee.clear();
        etFee.sendKeys(String.valueOf(fee));
        return this;
    }

    public CalculatorPageBatch4 tapCalculatorBtn() {
        btnCalculate.isDisplayed();
        btnCalculate.click();
        return this;
    }

    public CalculatorPageBatch4 tapResetBtn() {
        btnReset.isDisplayed();
        btnReset.click();
        return this;
    }

    public LoanDetailPage tapDetailBtn() {
        btnDetail.isDisplayed();
        btnDetail.click();
        return new LoanDetailPage();
    }

    public boolean hasDetailBtn() {
        return btnDetail.isDisplayed();
    }


}
