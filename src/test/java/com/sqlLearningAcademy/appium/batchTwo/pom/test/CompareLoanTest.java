package com.sqlLearningAcademy.appium.batchTwo.pom.test;


import com.sqlLearningAcademy.appium.batchTwo.pom.BaseAppiumTest;
import com.sqlLearningAcademy.appium.batchTwo.pom.pages.CompareLoanPage;
import com.sqlLearningAcademy.appium.batchTwo.pom.pages.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CompareLoanTest extends BaseAppiumTest {
    CompareLoanPage compareLoanPage;

    @BeforeClass
    public void setup() {
        initialization();
        compareLoanPage = new HomePage().tapCompareBtn();
    }


    @Test(dataProvider = "sajib")
    public void compareLoanShouldSucceed(int amount1, int in1) {
        compareLoanPage = compareLoanPage
                .fillLoanAmount1(amount1)
                .fillInterest1(in1)
                .fillPeriod1(12)
                .fillLoanAmount2(15000)
                .fillInterest2(7)
                .fillPeriod2(3)
                .clickRestBtn();
    }


    @AfterClass
    public void dearDown() {
        driver.quit();
    }
}
