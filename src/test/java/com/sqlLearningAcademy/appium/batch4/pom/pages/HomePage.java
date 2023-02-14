package com.sqlLearningAcademy.appium.batch4.pom.pages;


import com.sqlLearningAcademy.appium.batch4.pom.BaseEmiCalculatorAppiumBatch4Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseEmiCalculatorAppiumBatch4Test {
    @FindBy(id = "btnStart")
    WebElement emiCalculatorBtn;

    @FindBy(id = "btnCompare")
    WebElement compareLoanBtn;

    public HomePage() {
        ////        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(General.TIME_OUT)), this);
        PageFactory.initElements(driver, this);
    }

    public CalculatorPageBatch4 tapEmiCalculatorBtn() {
        emiCalculatorBtn.isDisplayed();
        emiCalculatorBtn.click();
        return new CalculatorPageBatch4();
    }

    public CompareLoanPage tapCompareLoanBtn() {
        compareLoanBtn.isDisplayed();
        compareLoanBtn.click();
        return new CompareLoanPage();
    }

}
