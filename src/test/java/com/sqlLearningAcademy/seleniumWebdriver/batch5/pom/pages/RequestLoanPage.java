package com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages;

import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.BaseBatch5ParaBankTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RequestLoanPage extends BaseBatch5ParaBankTest {
    @FindBy(id = "amount")
    WebElement amountEl;

    @FindBy(id = "downPayment")
    WebElement downPaymentEl;

    @FindBy(css = "input.button")
    WebElement applyNowBtn;

    @FindBy(id = "newAccountId")
    List<WebElement> newAccountIds;

    public RequestLoanPage() {
        PageFactory.initElements(driver, this);
    }

    public RequestLoanPage fillAmount(int amount) {
        amountEl.isDisplayed();
        amountEl.clear();
        amountEl.sendKeys(String.valueOf(amount));
        return this;
    }

    public RequestLoanPage fillDownPayment(int payment) {
        downPaymentEl.isDisplayed();
        downPaymentEl.clear();
        downPaymentEl.sendKeys(String.valueOf(payment));
        return this;
    }

    public RequestLoanPage clickApplyNowBtn() {
        applyNowBtn.isDisplayed();
        applyNowBtn.click();
        return this;
    }

    public boolean hasNewAccountId() {
        return newAccountIds.size() > 0;
    }

}
