package com.sqlLearningAcademy.appium.batchTwo.pom.pages;

import com.sqlLearningAcademy.appium.batchTwo.pom.BaseAppiumTest;
import com.sqlLearningAcademy.appium.batchTwo.pom.util.AppiumUtil;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage extends BaseAppiumTest {
    @AndroidFindBy(id = "btnStart")
    WebElement btnStart;

    @AndroidFindBy(id = "btnCompare")
    WebElement btnCompare;

    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(AppiumUtil.LOAD_TIME)),
                this);
    }

    public EmiCalculatorPage tapStartBtn() {
        btnStart.isDisplayed();
        btnStart.click();
        return new EmiCalculatorPage();
    }

    public CompareLoanPage tapCompareBtn() {
        btnCompare.isDisplayed();
        btnCompare.click();
        return new CompareLoanPage();
    }

}
