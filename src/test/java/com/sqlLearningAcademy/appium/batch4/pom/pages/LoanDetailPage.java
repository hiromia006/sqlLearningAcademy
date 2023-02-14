package com.sqlLearningAcademy.appium.batch4.pom.pages;


import com.sqlLearningAcademy.appium.batch4.pom.BaseEmiCalculatorAppiumBatch4Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanDetailPage extends BaseEmiCalculatorAppiumBatch4Test {
    @FindBy(id = "loan_amount_result")
    WebElement loan_amount_result;

    public LoanDetailPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean hasLoanAmountResult() {
        return loan_amount_result.isDisplayed();
    }

}
