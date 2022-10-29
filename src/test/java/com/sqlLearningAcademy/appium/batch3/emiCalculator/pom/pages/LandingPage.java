package com.sqlLearningAcademy.appium.batch3.emiCalculator.pom.pages;

import com.sqlLearningAcademy.appium.batch3.emiCalculator.pom.testcases.EmiCalculatorBaseTest;
import com.sqlLearningAcademy.appium.batch3.emiCalculator.pom.util.GeneralUtil;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class LandingPage extends EmiCalculatorBaseTest {
    @AndroidBy(id = "btnStart")
    WebElement btnStart;

    @AndroidBy(id = "btnCompare")
    WebElement btnCompare;

    public LandingPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }

    public EmiCalculatorPage tapEmiCalculator() {
        btnStart.isDisplayed();
        btnStart.click();
        return new EmiCalculatorPage();
    }

    public CompareLoanPage tapCompareLoan() {
        btnCompare.isDisplayed();
        btnCompare.click();
        return new CompareLoanPage();
    }

}
