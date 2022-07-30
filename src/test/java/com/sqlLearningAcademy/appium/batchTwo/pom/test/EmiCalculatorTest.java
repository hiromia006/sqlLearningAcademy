package com.sqlLearningAcademy.appium.batchTwo.pom.test;

import com.sqlLearningAcademy.appium.batchTwo.pom.BaseAppiumTest;
import com.sqlLearningAcademy.appium.batchTwo.pom.pages.EmiCalculatorPage;
import com.sqlLearningAcademy.appium.batchTwo.pom.pages.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends BaseAppiumTest {
    EmiCalculatorPage emiCalculatorPage;

    @BeforeClass
    public void setup() {
        initialization();

        emiCalculatorPage = new HomePage()
                .tapStartBtn();
    }

    @Test
    public void calculateEmiShouldSucceed() {
        emiCalculatorPage = emiCalculatorPage
                .fillAmount(5000000)
                .fillInterest(8)
                .fillYears(5)
                .fillMonths(1)
                .fillFees(2)
                .tapBtnCalculate();
    }

    @Test
    public void resetEmiShouldSucceed() {
        emiCalculatorPage = emiCalculatorPage
                .fillAmount(5000000)
                .fillInterest(8)
                .fillYears(5)
                .fillMonths(1)
                .fillFees(2)
                .tapResetCalculateBtn();
    }


    @Test
    public void calculateDetailEmiShouldSucceed() {
        emiCalculatorPage = emiCalculatorPage
                .fillAmount(5000000)
                .fillInterest(8)
                .fillYears(5)
                .fillMonths(1)
                .fillFees(2)
                .tapBtnCalculate()
                .tapDetailCalculateBtn();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
